package com.example.excel.controll;

import com.example.excel.dao.recordExceldao;
import com.example.excel.pojo.Excel;

import com.example.excel.pojo.xjrecordexcel;
import com.example.excel.service.recordExcelService;
import com.example.excel.utils.ExportExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigInteger;
import java.util.*;


@RestController
@CrossOrigin
@RequestMapping("/excel")
public class ExcelController {

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private recordExcelService recordExcelService;



    @RequestMapping(value = "/getExcelRecord/{uid}",method = RequestMethod.GET)
    public Map<String,Object> get(@PathVariable String uid){
        Map<String,Object> map=new HashMap<>();
        map.put("recordexcellist",recordExcelService.getXjRecordExcel(uid));
        return  map;
    }

        @RequestMapping(value = "/excel",method = RequestMethod.GET)
    public void ExportBankCkeckInfo(HttpServletResponse response, HttpServletRequest request){



          //这里是笔者实际业务需求中需要得到时间间隔。可忽略
        String start=request.getParameter("start");
        String end=request.getParameter("end");
        System.out.println("打印的起始日期为："+start+"，打印的结束日期为："+end);
        //得到所有要导出的数据
        List<Excel> orderlist =new ArrayList();
        for (int i = 0; i <10 ; i++) {
            Excel excel=new Excel();
            excel.setId(i);
            excel.setAddress("xascascas"+i);
            excel.setLink_man("dakcsa skl"+i);
            excel.setDate_add("adadw"+i);
            excel.setAmount_real("adaac"+i);
            orderlist.add(excel);
        }
        //定义导出的excel名字
        String excelName = "巡检记录表";

        //获取需要转出的excel表头的map字段
        LinkedHashMap<String, String> fieldMap = new LinkedHashMap<>();
        fieldMap.put("id","编号");
        fieldMap.put("link_man","姓名");
        fieldMap.put("amount_real","价格");
        fieldMap.put("date_add","日期");
        fieldMap.put("status_str","订单状态");
        fieldMap.put("mobie","收货电话");
        fieldMap.put("address","地址");
        fieldMap.put("detailValue","订单详情");


        //导出用户相关信息
       // new ExportExcelUtils().export(excelName,orderlist,fieldMap,response);
    }

}

