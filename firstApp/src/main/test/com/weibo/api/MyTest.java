package com.weibo.api;

import com.sun.jersey.api.client.WebResource;
import com.weibo.api.service.WorkflowController;
import com.sun.jersey.api.client.Client;
import com.weibo.api.service.hbase.HBaseApi;
import junit.framework.TestCase;
//import org.apache.hadoop.hbase.client.Result;
//import org.apache.hadoop.hbase.KeyValue;
//import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.hbase.avro.generated.HBase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Before;
import org.junit.Test;
import org.springframework.data.hadoop.hbase.HbaseTemplate;
import org.springframework.data.hadoop.hbase.RowMapper;

/**
 * Created by fengkai on 16-2-23.
 */
public class MyTest extends TestCase {
    private WorkflowController workflowController;
    private WorkflowResource workflowResource;
    //private HbaseTemplate hbaseTemplate;
    private HBaseApi hBaseApi;
    @Before
    public void setUp() throws Exception {
        super.setUp();
        ApplicationContext app = new ClassPathXmlApplicationContext(new String[]{"classpath:/spring/service.xml"});
        workflowController = app.getBean(WorkflowController.class);
        workflowResource = app.getBean(WorkflowResource.class);
        hBaseApi = app.getBean(HBaseApi.class);
        //hbaseTemplate = app.getBean(HbaseTemplate.class);
    }

    @Test
    public void test() {
        String url = "http://localhost:8081/rest/restful/hello";
        System.out.print("test");
        Client c = Client.create();  //创建一个 com.sun.jersey .api.client.Client 类的实例
        WebResource wr = c.resource(url);  // 建了一个 WebResponse 对象
        String result = wr.get(String.class);
    }

    @Test
    public void testHbase() throws Exception {
        String result = hBaseApi.get("rank_info", "test_daily", "m", "type");
    }

}
