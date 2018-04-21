package com.lvxz.entity;

/**
 * Introduction: 物料信息对象
 * Created by  LvXZ  on 2018/4/3.
 */
public class Tiitm001 {
    private String item;//物料编码
    private String dsca;//物料名称
    private String citg;//物料组
    private String kitm;//物料类型
    private String cpha;//
    private String cuni;//计量单位
    private String ctyp;//产品型号
    private String fdxs;//
    private String cate;//
    private String ifspec;//
    private int copr;//
    private String plan;//
    private String dyym;//
    private String bgym;//
    private String att1;//备注1

    private int ccc;//尺寸规格--长
    private int cck;//尺寸规格--宽
    private int ccg;//尺寸规格--高
    private String ccgg;//尺寸规格

    private String prcdhid;//该物料的工艺路线代码

    private String message;

    public Tiitm001() {
    }

    public Tiitm001(String item, String dsca, String citg, String kitm, String cpha, String cuni, String ctyp, String fdxs, String cate, String ifspec, int copr, String plan, String dyym, String bgym, String att1, int ccc, int cck, int ccg, String ccgg, String prcdhid, String message) {
        this.item = item;
        this.dsca = dsca;
        this.citg = citg;
        this.kitm = kitm;
        this.cpha = cpha;
        this.cuni = cuni;
        this.ctyp = ctyp;
        this.fdxs = fdxs;
        this.cate = cate;
        this.ifspec = ifspec;
        this.copr = copr;
        this.plan = plan;
        this.dyym = dyym;
        this.bgym = bgym;
        this.att1 = att1;
        this.ccc = ccc;
        this.cck = cck;
        this.ccg = ccg;
        this.ccgg = ccgg;
        this.prcdhid = prcdhid;
        this.message = message;
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

    public String getCitg() {
        return citg;
    }

    public void setCitg(String citg) {
        this.citg = citg;
    }

    public String getKitm() {
        return kitm;
    }

    public void setKitm(String kitm) {
        this.kitm = kitm;
    }

    public String getCpha() {
        return cpha;
    }

    public void setCpha(String cpha) {
        this.cpha = cpha;
    }

    public String getCuni() {
        return cuni;
    }

    public void setCuni(String cuni) {
        this.cuni = cuni;
    }

    public String getCtyp() {
        return ctyp;
    }

    public void setCtyp(String ctyp) {
        this.ctyp = ctyp;
    }

    public String getFdxs() {
        return fdxs;
    }

    public void setFdxs(String fdxs) {
        this.fdxs = fdxs;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public String getIfspec() {
        return ifspec;
    }

    public void setIfspec(String ifspec) {
        this.ifspec = ifspec;
    }

    public int getCopr() {
        return copr;
    }

    public void setCopr(int copr) {
        this.copr = copr;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getDyym() {
        return dyym;
    }

    public void setDyym(String dyym) {
        this.dyym = dyym;
    }

    public String getBgym() {
        return bgym;
    }

    public void setBgym(String bgym) {
        this.bgym = bgym;
    }

    public String getAtt1() {
        return att1;
    }

    public void setAtt1(String att1) {
        this.att1 = att1;
    }

    public int getCcc() {
        return ccc;
    }

    public void setCcc(int ccc) {
        this.ccc = ccc;
    }

    public int getCck() {
        return cck;
    }

    public void setCck(int cck) {
        this.cck = cck;
    }

    public int getCcg() {
        return ccg;
    }

    public void setCcg(int ccg) {
        this.ccg = ccg;
    }

    public String getCcgg() {
        return ccgg;
    }

    public void setCcgg(String ccgg) {
        this.ccgg = ccgg;
    }

    public String getPrcdhid() {
        return prcdhid;
    }

    public void setPrcdhid(String prcdhid) {
        this.prcdhid = prcdhid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
