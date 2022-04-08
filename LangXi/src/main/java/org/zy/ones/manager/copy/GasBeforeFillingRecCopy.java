package org.zy.ones.manager.copy;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.zy.ones.manager.dto.GasBeforeFillingRecDto;
import org.zy.ones.manager.entity.GasBeforeFillingRecEntity;

/**
 * Created by liYueYang on 2022/1/26.
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,uses=DateCopy.class)
public interface GasBeforeFillingRecCopy extends BaseCopy<GasBeforeFillingRecDto, GasBeforeFillingRecEntity>{
}
