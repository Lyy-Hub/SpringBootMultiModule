package org.zy.ones.manager.service.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.IService;
import lombok.extern.slf4j.Slf4j;
import org.zy.ones.manager.copy.BaseCopy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangtw
 * @date 2021年12月21日 15:46
 * description:
 */
@Slf4j
public class BasePlantListener<T> extends AnalysisEventListener<T> {

    private static final int BATCH_COUNT = 3000;
    List<T> list = new ArrayList<T>();
    private IService service;
    private BaseCopy copy;

    public BasePlantListener(IService service, BaseCopy copy) {
        this.service = service;
        this.copy = copy;
    }

    @Override
    public void invoke(T t, AnalysisContext analysisContext) {
        log.info("解析到一条数据:{}", JSON.toJSONString(t));
        list.add(t);
        if(list.size()>=BATCH_COUNT){
            service.saveBatch(copy.toEntity(list));
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        service.saveBatch(copy.toEntity(list));
    }
}
