package com.lvxz.DTO;

import java.util.List;

/**
 * Introduction: 菜单返回重新定义类
 * Created by  LvXZ  on 2018/3/31.
 */
public class MenuInfoDTO {

    private String parentMenu;
    private String menuName;
    private String menuText;
    private int seq_order;
    private int child;
    private List<MenuInfoDTO> menuInfoDTOList;

    public MenuInfoDTO() {
    }

    public MenuInfoDTO(String parentMenu, String menuName, String menuText, int seq_order, int child, List<MenuInfoDTO> menuInfoDTOList) {
        this.parentMenu = parentMenu;
        this.menuName = menuName;
        this.menuText = menuText;
        this.seq_order = seq_order;
        this.child = child;
        this.menuInfoDTOList = menuInfoDTOList;
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

    public List<MenuInfoDTO> getMenuInfoDTOList() {
        return menuInfoDTOList;
    }

    public void setMenuInfoDTOList(List<MenuInfoDTO> menuInfoDTOList) {
        this.menuInfoDTOList = menuInfoDTOList;
    }
}
