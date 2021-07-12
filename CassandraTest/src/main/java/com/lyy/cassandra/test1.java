package com.lyy.cassandra;

import com.datastax.oss.driver.api.core.uuid.Uuids;

import java.util.UUID;

/**
 * Created by liYueYang on 2020/9/24.
 */
public class test1 {
    public static void main(String[] args) {
        UUID uuid = Uuids.timeBased();
        long time = Uuids.unixTimestamp(uuid);
        System.out.println(uuid.toString());
        System.out.println(time);
    }
}
