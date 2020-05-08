package com.example.excel.dao;

import com.example.excel.pojo.xjrecordexcel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface recordExceldao extends JpaRepository<xjrecordexcel,String>, JpaSpecificationExecutor<xjrecordexcel> {

    @Query(value="select r.xjid,r.labid,l.label,r.xjr_uid,u.username,res.resullt,res.description,r.gmt_create from xjrecord as r,user as u,laboratory as l,xjresult as res where u.uid= r.xjr_uid and r.labid=l.labid and res.xjid=r.xjid and xjr_uid=?",nativeQuery = true)
    List<xjrecordexcel> getXjRecordExcel(String uid);
}
