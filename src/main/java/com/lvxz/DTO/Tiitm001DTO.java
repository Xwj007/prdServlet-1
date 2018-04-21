package com.lvxz.DTO;

/**
 * Introduction: Tiitm001输出类
 * Created by  LvXZ  on 2018/4/8.
 */
public class Tiitm001DTO {
    private String item;//物料编码
    private String dsca;//物料名称

    public Tiitm001DTO() {
    }

    public Tiitm001DTO(String item, String dsca) {
        this.item = item;
        this.dsca = dsca;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDsca() {
        return dsca;
    }

    public void setDsca(String dsca) {
        this.dsca = dsca;
    }
}
