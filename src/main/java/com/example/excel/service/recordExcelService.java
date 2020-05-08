package com.example.excel.service;

import com.example.excel.dao.recordExceldao;
import com.example.excel.pojo.xjrecordexcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class recordExcelService {
    @Autowired
    private com.example.excel.dao.recordExceldao recordExceldao;
   public List<xjrecordexcel> getXjRecordExcel(String uid){
        return recordExceldao.getXjRecordExcel(uid);
    }
}

