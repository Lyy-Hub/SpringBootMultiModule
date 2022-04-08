package org.zy.ones.manager.copy;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.zy.ones.manager.dto.GasHouseHoldCheckDto;
import org.zy.ones.manager.entity.GasHouseHoldCheckEntity;

/**
 * Created by liYueYang on 2022/1/18.
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = DateCopy.class)
public interface GasHouseHoldCheckCopy extends BaseCopy<GasHouseHoldCheckDto, GasHouseHoldCheckEntity> {
}
