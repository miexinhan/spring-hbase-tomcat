package com.weibo.api.service.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;


/**
 * Created by fengkai on 16-3-9.
 */
public class HBaseApi {
    private Configuration configuration;
    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public String get(String tableName, String rowKey, String family, String qualifier) {
        String value = null;
        try {
            byte [] row = rowKey.getBytes();
            HTable hTable = new HTable(configuration, tableName);
            Get get = new Get(row);
            get.addColumn(family.getBytes(), qualifier.getBytes());
            Result result = hTable.get(get);
        } catch (Exception e) {
            ;
        }
        return value;
    }
}
