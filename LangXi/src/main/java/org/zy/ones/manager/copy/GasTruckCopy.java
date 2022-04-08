package org.zy.ones.manager.copy;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.zy.ones.manager.dto.GasTruckDto;
import org.zy.ones.manager.entity.GasTruckEntity;

/**
 * Created by liYueYang on 2022/1/13.
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,uses=DateCopy.class)
public interface GasTruckCopy extends BaseCopy<GasTruckDto, GasTruckEntity> {
}
