package org.robin.ones.gasmanager.copy;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.robin.ones.gasmanager.dto.GasFillingRecordDto;
import org.robin.ones.gasmanager.entity.GasFillingRecordEntity;

/**
 * Created by liYueYang on 2022/1/11.
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,uses=DateCopy.class)
public interface GasFillingRecordCopy extends BaseCopy<GasFillingRecordDto, GasFillingRecordEntity>{
}
