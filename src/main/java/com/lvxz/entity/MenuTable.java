package com.lvxz.entity;

/**
 * Introduction: 一级二级菜单类
 * Created by  LvXZ  on 2018/3/31.
 */
public class MenuTable {

    private String parentMenu;
    private String menuName;
    private String menuText;
    private int seq_order;
    private int child;
    private String memo;
    private String menuTag;
    private String whelpid;
    private int sysId;
    private String url = "暂时都为空";     //对应按钮响应地址连接，暂时都为空

    public MenuTable() {
    }

    public MenuTable(String parentMenu, String menuName, String menuText, int seq_order, int child, String memo, String menuTag, String whelpid, int sysId, String url) {
        this.parentMenu = parentMenu;
        this.menuName = menuName;
        this.menuText = menuText;
        this.seq_order = seq_order;
        this.child = child;
        this.memo = memo;
        this.menuTag = menuTag;
        this.whelpid = whelpid;
        this.sysId = sysId;
        this.url = url;
    }

    public String getParentMenu() {
        return parentMenu;
    }

    public void setParentMenu(String parentMenu) {
        this.parentMenu = parentMenu;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuText() {
        return menuText;
    }

    public void setMenuText(String menuText) {
        this.menuText = menuText;
    }

    public int getSeq_order() {
        return seq_order;
    }

    public void setSeq_order(int seq_order) {
        this.seq_order = seq_order;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMenuTag() {
        return menuTag;
    }

    public void setMenuTag(String menuTag) {
        this.menuTag = menuTag;
    }

    public String getWhelpid() {
        return whelpid;
    }

    public void setWhelpid(String whelpid) {
        this.whelpid = whelpid;
    }

    public int getSysId() {
        return sysId;
    }

    public void setSysId(int sysId) {
        this.sysId = sysId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
