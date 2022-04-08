package org.robin.ones.gasmanager.copy;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.robin.ones.gasmanager.dto.GasLpgTransferDto;
import org.robin.ones.gasmanager.entity.GasLpgTransferEntity;

/**
 * Created by liYueYang on 2022/1/13.
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,uses=DateCopy.class)
public interface GasLpgTransferCopy extends BaseCopy<GasLpgTransferDto, GasLpgTransferEntity> {
}
