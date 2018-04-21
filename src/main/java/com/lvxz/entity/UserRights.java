package com.lvxz.entity;

/**
 * Introduction: 用户权限类
 * Created by  LvXZ  on 2018/3/31.
 */
public class UserRights {

    private String userName;    //对应用户loginID
    private String menuName;    //用户权限
    private String sysId;

    public UserRights() {
    }

    public UserRights(String userName, String menuName, String sysId) {
        this.userName = userName;
        this.menuName = menuName;
        this.sysId = sysId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }
}
