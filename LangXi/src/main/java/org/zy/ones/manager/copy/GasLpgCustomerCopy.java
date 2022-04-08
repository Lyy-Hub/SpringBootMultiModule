package org.zy.ones.manager.copy;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.zy.ones.manager.dto.GasLpgCustomerDto;
import org.zy.ones.manager.entity.GasLpgCustomerEntity;

/**
 * Created by liYueYang on 2022/1/18.
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = DateCopy.class)
public interface GasLpgCustomerCopy extends BaseCopy<GasLpgCustomerDto, GasLpgCustomerEntity> {
}
