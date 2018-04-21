package com.lvxz.entity;

/**
 * Introduction: 用户登录类
 * Created by  LvXZ  on 2018/3/31.
 */
public class UserID {

    private String loginID;
    private String fullName;
    private String department;
    private String phone;
    private long detail;
    private String passwd;
    private String cpno;
    private String enbl;
    private String rsnl;
    private String cpuid;
    private String account;

    public UserID() {
    }

    public UserID(String loginID, String fullName, String department, String phone, long detail, String passwd, String cpno, String enbl, String rsnl, String cpuid, String account) {
        this.loginID = loginID;
        this.fullName = fullName;
        this.department = department;
        this.phone = phone;
        this.detail = detail;
        this.passwd = passwd;
        this.cpno = cpno;
        this.enbl = enbl;
        this.rsnl = rsnl;
        this.cpuid = cpuid;
        this.account = account;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getDetail() {
        return detail;
    }

    public void setDetail(long detail) {
        this.detail = detail;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getCpno() {
        return cpno;
    }

    public void setCpno(String cpno) {
        this.cpno = cpno;
    }

    public String getEnbl() {
        return enbl;
    }

    public void setEnbl(String enbl) {
        this.enbl = enbl;
    }

    public String getRsnl() {
        return rsnl;
    }

    public void setRsnl(String rsnl) {
        this.rsnl = rsnl;
    }

    public String getCpuid() {
        return cpuid;
    }

    public void setCpuid(String cpuid) {
        this.cpuid = cpuid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
