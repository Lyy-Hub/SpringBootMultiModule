package com.lyy;

import cn.hutool.core.lang.UUID;
import com.lyy.util.SnowflakeIdWorker;

/**
 * Created by liYueYang on 2020/9/8.
 */
public class Test {
    public static void main(String[] args) {
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        long id = idWorker.nextId();
        System.out.println(id);
        System.out.println(UUID.randomUUID());
    }
}
