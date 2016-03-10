package com.weibo.api.service;

//import org.apache.hadoop.hbase.KeyValue;
//import org.apache.hadoop.hbase.client.Result;
//import org.apache.hadoop.hbase.util.Bytes;
//import org.springframework.data.hadoop.hbase.HbaseTemplate;
//import org.springframework.data.hadoop.hbase.RowMapper;


import com.weibo.api.service.hbase.HBaseApi;
import org.springframework.data.hadoop.hbase.HbaseTemplate;

import java.sql.Connection;

/**
 * Created by fengkai on 16-2-19.
 */
public class WorkflowController {
    private HbaseTemplate hbaseTemplate;
    private Connection connection;
    private String key = "test";
    private HBaseApi hBaseApi;

    public void setHbaseTemplate(HbaseTemplate hbaseTemplate) {
        this.hbaseTemplate = hbaseTemplate;
    }

    public void sethBaseApi(HBaseApi hBaseApi) {
        this.hBaseApi = hBaseApi;
    }

    public String func() {
        return "Controller Hello!";
    }

    public String testHBase() {
        return "";
    }


}
