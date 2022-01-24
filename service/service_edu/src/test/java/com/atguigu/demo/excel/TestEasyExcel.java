package com.atguigu.demo.excel;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

public class TestEasyExcel {
    public static void main(String[] args) {
        String fileName = "D:\\write.xlsx";
        //写操作
        //EasyExcel.write(fileName,DemoData.class).sheet("学生列表").doWrite(getData());

        //读操作
        EasyExcel.read(fileName,DemoData.class,new ExcelListener()).sheet("学生列表").doRead();
    }

    private static List<DemoData> getData(){
        List<DemoData> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new DemoData(i,"soon" + i));
        }
        return list;
    }
}
