package com.example.excel.pojo;

import java.math.BigInteger;

/**
 * @author created by Zhangdazhuang
 * @version v.0.1
 * @Description TODO
 * @date 2019/4/7
 * @备注
 **/

//select r.xjid,r.labid,l.label,r.xjr_uid,u.username,res.resullt,res.description,r.gmt_create from xjrecord as r,user as u,laboratory as l,xjresult as res where u.uid= r.xjr_uid and r.labid=l.labid and res.xjid=r.xjid and xjr_uid=78714756973858818

public class Excel {
    private Integer id;
    private String order_number;
    private String amount_real;
    private String date_add;
    private String status_str;
    private String link_man;
    private String mobie;
    private String address;
    private String detailValue;

    public Excel() {

    }

    public Excel(Integer id, String order_number, String amount_real, String date_add, String status_str, String link_man, String mobie, String address, String detailValue) {
        this.id = id;
        this.order_number = order_number;
        this.amount_real = amount_real;
        this.date_add = date_add;
        this.status_str = status_str;
        this.link_man = link_man;
        this.mobie = mobie;
        this.address = address;
        this.detailValue = detailValue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public String getAmount_real() {
        return amount_real;
    }

    public void setAmount_real(String amount_real) {
        this.amount_real = amount_real;
    }

    public String getDate_add() {
        return date_add;
    }

    public void setDate_add(String date_add) {
        this.date_add = date_add;
    }

    public String getStatus_str() {
        return status_str;
    }

    public void setStatus_str(String status_str) {
        this.status_str = status_str;
    }

    public String getLink_man() {
        return link_man;
    }

    public void setLink_man(String link_man) {
        this.link_man = link_man;
    }

    public String getMobie() {
        return mobie;
    }

    public void setMobie(String mobie) {
        this.mobie = mobie;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetailValue() {
        return detailValue;
    }

    public void setDetailValue(String detailValue) {
        this.detailValue = detailValue;
    }
}

