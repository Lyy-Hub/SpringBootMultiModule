package org.robin.ones.gasmanager.copy;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.robin.ones.gasmanager.dto.GasLpgCustomerDto;
import org.robin.ones.gasmanager.entity.GasLpgCustomerEntity;

/**
 * Created by liYueYang on 2022/1/18.
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = DateCopy.class)
public interface GasLpgCustomerCopy extends BaseCopy<GasLpgCustomerDto, GasLpgCustomerEntity> {
}
