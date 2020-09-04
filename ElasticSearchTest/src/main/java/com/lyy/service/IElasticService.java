package com.lyy.service;

import com.lyy.entity.DocBean;
import org.springframework.data.domain.Page;

import java.util.Iterator;
import java.util.List;

/**
 * Created by liYueYang on 2020/9/4.
 */
public interface IElasticService {
    void createIndex();

    void deleteIndex(String index);

    void save(DocBean docBean);

    void saveAll(List<DocBean> list);

    Iterator<DocBean> findAll();

    Page<DocBean> findByContent(String content);

    Page<DocBean> findByFirstCode(String firstCode);

    Page<DocBean> findBySecordCode(String secordCode);

    Page<DocBean> query(String key);
}
