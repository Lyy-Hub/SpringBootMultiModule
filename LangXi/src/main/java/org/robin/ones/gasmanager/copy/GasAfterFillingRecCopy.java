package org.robin.ones.gasmanager.copy;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.robin.ones.gasmanager.dto.GasAfterFillingRecDto;
import org.robin.ones.gasmanager.entity.GasAfterFillingRecEntity;

/**
 * Created by liYueYang on 2022/1/26.
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,uses=DateCopy.class)
public interface GasAfterFillingRecCopy extends BaseCopy<GasAfterFillingRecDto, GasAfterFillingRecEntity>{
}
