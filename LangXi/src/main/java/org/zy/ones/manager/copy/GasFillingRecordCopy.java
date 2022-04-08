package org.zy.ones.manager.copy;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.zy.ones.manager.dto.GasFillingRecordDto;
import org.zy.ones.manager.entity.GasFillingRecordEntity;

/**
 * Created by liYueYang on 2022/1/11.
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,uses=DateCopy.class)
public interface GasFillingRecordCopy extends BaseCopy<GasFillingRecordDto, GasFillingRecordEntity>{
}
