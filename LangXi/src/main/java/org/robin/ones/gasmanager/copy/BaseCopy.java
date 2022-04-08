package org.robin.ones.gasmanager.copy;

import java.util.List;

/**
 * @author xiangtw
 * @date 2021年12月14日 9:55
 * description:
 */
public interface BaseCopy <D,E>{
    /**
     * DTO转Entity
     * @param dto /
     * @return /
     */
    E toEntity(D dto);

    /**
     * Entity转DTO
     * @param entity /
     * @return /
     */
    D toDto(E entity);

    /**
     * DTO集合转Entity集合
     * @param dtoList /
     * @return /
     */
    List<E> toEntity(List<D> dtoList);

    /**
     * Entity集合转DTO集合
     * @param entityList /
     * @return /
     */
    List <D> toDto(List<E> entityList);

}
