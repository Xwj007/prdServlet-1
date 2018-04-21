package com.lvxz.mapper;

import com.lvxz.DTO.Tdsal001DTO;
import com.lvxz.DTO.Tiitm001DTO;
import com.lvxz.entity.Tdsal001;
import com.lvxz.entity.Tiitm001;

import java.util.List;

/**
 * Introduction: 具体数据库物料sql映射
 * Created by  LvXZ  on 2018/4/2.
 */
public interface WorkMapper {

    List<Tiitm001DTO> findAllTiitm001();
    Tiitm001 findTiitm001ByItemID(String item);

    List<Tdsal001DTO> findAllTdsal001();
    Tdsal001 findTdsal001ByDDH(long ddh);
}
