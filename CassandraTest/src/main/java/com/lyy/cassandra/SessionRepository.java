package com.lyy.cassandra;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class SessionRepository {
    private static Session instance = null;
    private static Cluster cluster = null;
    private static Lock lock = new ReentrantLock();

    private SessionRepository() {
    }

    public static Session getSession() {
        if (null == instance) {
            try {
                lock.lock();

                if (null == instance) {
                    cluster = Cluster.builder().addContactPoint("192.168.1.59").withCredentials("admin", "admin").build();
                    instance = cluster.connect("zydx");
                }
            } finally {
                lock.unlock();
            }
        }
        return instance;
    }

    public static void close() {
        if (null == cluster) {
            try {
                lock.lock();
                if (null == cluster) {
                    cluster.close();
                }
            } finally {
                lock.unlock();
            }
        }
    }
}