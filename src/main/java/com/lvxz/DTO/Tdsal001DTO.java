package com.lvxz.DTO;

/**
 * Introduction: Tdsal001输出类
 * Created by  LvXZ  on 2018/4/15.
 */
public class Tdsal001DTO {
    private long ddh;   //销售订单号
    private String stat;    //状态
    private String ddname;  //订单名称

    public Tdsal001DTO() {
    }

    public Tdsal001DTO(long ddh, String stat, String ddname) {
        this.ddh = ddh;
        this.stat = stat;
        this.ddname = ddname;
    }

    public long getDdh() {
        return ddh;
    }

    public void setDdh(long ddh) {
        this.ddh = ddh;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getDdname() {
        return ddname;
    }

    public void setDdname(String ddname) {
        this.ddname = ddname;
    }
}
