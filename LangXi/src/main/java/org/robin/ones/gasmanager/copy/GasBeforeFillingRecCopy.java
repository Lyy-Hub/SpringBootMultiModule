package org.robin.ones.gasmanager.copy;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.robin.ones.gasmanager.dto.GasBeforeFillingRecDto;
import org.robin.ones.gasmanager.entity.GasBeforeFillingRecEntity;

/**
 * Created by liYueYang on 2022/1/26.
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,uses=DateCopy.class)
public interface GasBeforeFillingRecCopy extends BaseCopy<GasBeforeFillingRecDto, GasBeforeFillingRecEntity>{
}
