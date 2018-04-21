package com.lvxz.entity;

import java.util.Date;

/**
 * Introduction: 订单信息表
 * Created by  LvXZ  on 2018/4/15.
 */
public class Tdsal001 {
    private long ddh;       //销售订单号
    private String stat;    //状态
    private String ddname;  //订单名称

    private String cuno;    //客户号
    private Date jhdt;      //计划交付日期
    private Date jfdt;      //交付日期
    private String createby;//创建人
    private Date createdate;//创建时间

    private String idno;    //id号
    private String issh;    //是否售后
    private String zydj;    //重要等级
    private String cout;    //合同号
    private String trid;    //维护人
    private Date trdt;      //维护时间

    public Tdsal001() {
    }

    public Tdsal001(long ddh, String stat, String ddname, String cuno, Date jhdt, Date jfdt, String createby, Date createdate) {
        this.ddh = ddh;
        this.stat = stat;
        this.ddname = ddname;
        this.cuno = cuno;
        this.jhdt = jhdt;
        this.jfdt = jfdt;
        this.createby = createby;
        this.createdate = createdate;
    }

    public Tdsal001(long ddh, String stat, String ddname, String cuno, Date jhdt, Date jfdt, String createby, Date createdate, String idno, String issh, String zydj, String cout, String trid, Date trdt) {
        this.ddh = ddh;
        this.stat = stat;
        this.ddname = ddname;
        this.cuno = cuno;
        this.jhdt = jhdt;
        this.jfdt = jfdt;
        this.createby = createby;
        this.createdate = createdate;
        this.idno = idno;
        this.issh = issh;
        this.zydj = zydj;
        this.cout = cout;
        this.trid = trid;
        this.trdt = trdt;
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

    public String getCuno() {
        return cuno;
    }

    public void setCuno(String cuno) {
        this.cuno = cuno;
    }

    public Date getJhdt() {
        return jhdt;
    }

    public void setJhdt(Date jhdt) {
        this.jhdt = jhdt;
    }

    public Date getJfdt() {
        return jfdt;
    }

    public void setJfdt(Date jfdt) {
        this.jfdt = jfdt;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getIssh() {
        return issh;
    }

    public void setIssh(String issh) {
        this.issh = issh;
    }

    public String getZydj() {
        return zydj;
    }

    public void setZydj(String zydj) {
        this.zydj = zydj;
    }

    public String getCout() {
        return cout;
    }

    public void setCout(String cout) {
        this.cout = cout;
    }

    public String getTrid() {
        return trid;
    }

    public void setTrid(String trid) {
        this.trid = trid;
    }

    public Date getTrdt() {
        return trdt;
    }

    public void setTrdt(Date trdt) {
        this.trdt = trdt;
    }
}
