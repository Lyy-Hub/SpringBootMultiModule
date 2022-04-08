package org.zy.ones.manager.copy;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.zy.ones.manager.dto.GasLpgcyLinderDto;
import org.zy.ones.manager.entity.GasLpgcyLinderEntity;

/**
 * Created by liYueYang on 2022/1/13.
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,uses=DateCopy.class)
public interface GasLpgcyLinderCopy extends BaseCopy<GasLpgcyLinderDto, GasLpgcyLinderEntity> {
}
