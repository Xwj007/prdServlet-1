package com.lvxz.mapper;


import com.lvxz.DTO.MenuInfoDTO;
import com.lvxz.entity.MenuTable;
import com.lvxz.entity.UserID;
import com.lvxz.entity.UserRights;

import java.util.List;

/**
 * Introduction: 数据库操作函数
 * Created by  LvXZ  on 2018/3/31.
 */
public interface SqlMapper {

    UserID findUserIDByLoginID(String loginID);

    List<UserRights> findUserRightsByUserName(String userName);     //UserName == loginID

    List<MenuTable> findMenuTableByParentMenu(String parentMenu);   //通过父类parentMenu查找MenuTable
    List<MenuInfoDTO> getMenuInfoDTOByParentMenu(String parentMenu);
    List<MenuTable> findMenuTableByMenuName(String menuName);       //通过子类menuName查找MenuTable



}
