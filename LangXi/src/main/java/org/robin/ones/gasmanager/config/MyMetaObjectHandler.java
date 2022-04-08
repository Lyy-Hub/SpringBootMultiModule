package org.robin.ones.gasmanager.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 对数据库每条记录的创建时间和更新时间自动进行填充
 * @author xiangtw
 * @date 2021年12月24日 9:36
 * description:
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    /**
     * 插入时的填充策略
     * @author xiangtw
     * @date 2021/12/24 9:38
     * @param metaObject 
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime", LocalDateTime.now(), metaObject);
        this.setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
    }

    /**
     * 更新时的填充策略
     * @author xiangtw
     * @date 2021/12/24 9:38
     * @param metaObject 
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
    }
}
