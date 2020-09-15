package com.lyy.cassandra;

import com.datastax.driver.core.*;
import com.datastax.driver.core.exceptions.NoHostAvailableException;
import com.datastax.driver.core.exceptions.QueryExecutionException;
import com.datastax.driver.core.exceptions.QueryValidationException;
import com.datastax.driver.core.querybuilder.Batch;
import com.datastax.driver.core.querybuilder.QueryBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.datastax.driver.core.querybuilder.QueryBuilder.insertInto;

/**
 * Created by liYueYang on 2020/9/15.
 */
public class Test {
    public static void main(String[] args) {
        Session session = SessionRepository.getSession();
        List<User> users = new ArrayList<User>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            User user = new User();
            user.setId(UUID.randomUUID().toString());
            user.setName("liyueyang");
            user.setAddress("china");
            user.setNumber("0001001001");
            users.add(user);
            if (users.size() != 0 && users.size() % 10000 == 0) {
                manyInsert(session, users);
                System.out.println("======== 插入一万条成功 ========");
                users.clear();
            }
        }
        if (users.size() != 0) {
            manyInsert(session, users);
        }
        session.close();
        SessionRepository.close();
        long end = System.currentTimeMillis();
        System.out.println("======== 执行完毕，耗时：" + (end - start) / 1000 + "秒 ========");
    }

    private static void manyInsert(Session session, List<User> users) {
        Batch batch = QueryBuilder.unloggedBatch();
        for (User data : users) {
            Statement insert = insertInto("user").values(
                    new String[]{"id", "name", "address", "number"},
                    new Object[]{data.getId(), data.getName(), data.getAddress(), data.getNumber()});
            insert.setConsistencyLevel(ConsistencyLevel.QUORUM);
            batch.add((RegularStatement) insert);
        }
        session.execute(batch);
    }
}
