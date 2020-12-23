package com.example.demo;


import com.example.demo.discount.ComparisonOperatorEntity;
import com.example.demo.discount.Order;
 import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class test222 {
    @Test
    public  void test11(){
        BigDecimal dd= new BigDecimal("111.222");

        dd.setScale(2,BigDecimal.ROUND_DOWN);
        System.out.println( dd.doubleValue());
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieClasspathContainer = kieServices.getKieClasspathContainer();
        //会话对象，用于和规则引擎交互
        KieSession kieSession = kieClasspathContainer.newKieSession();
        List aaa = new ArrayList();
        //构造订单对象，设置原始价格，由规则引擎根据优惠规则计算优惠后的价格
        Order order = new Order();

        order.setRemark("CAAAADSADD");
        order.setRealPrice(555.454444);
        aaa.add(order);
        //aaa.add(ss);
        //将数据提供给规则引擎，规则引擎会根据提供的数据进行规则匹配
        kieSession.insert(order);

        //激活规则引擎，如果规则匹配成功则执行规则
        kieSession.fireAllRules();
        //关闭会话
        kieSession.dispose();

    }

    @Test
    public  void test22(){
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieClasspathContainer = kieServices.getKieClasspathContainer();
        //会话对象，用于和规则引擎交互
        KieSession kieSession = kieClasspathContainer.newKieSession();

        //构造订单对象，设置原始价格，由规则引擎根据优惠规则计算优惠后的价格
        ComparisonOperatorEntity order = new ComparisonOperatorEntity();
        order.setNames("aaaaa");
        //将数据提供给规则引擎，规则引擎会根据提供的数据进行规则匹配
        kieSession.insert(order);

        //激活规则引擎，如果规则匹配成功则执行规则
        kieSession.fireAllRules();
        //关闭会话
        kieSession.dispose();


    }


    //Test 字符串的长度
    @Test
    public  void test33(){
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieClasspathContainer = kieServices.getKieClasspathContainer();
        //会话对象，用于和规则引擎交互
        KieSession kieSession = kieClasspathContainer.newKieSession();

//        //构造订单对象，设置原始价格，由规则引擎根据优惠规则计算优惠后的价格
//        StringTest order = new StringTest();
//        order.test1 ="ABCDEFG";
//        //将数据提供给规则引擎，规则引擎会根据提供的数据进行规则匹配
//        kieSession.insert(order);
//        //激活规则引擎，如果规则匹配成功则执行规则
//        kieSession.fireAllRules();
//        //关闭会话
//        kieSession.dispose();
//
//        System.out.println();
//        ///
//        BigDecimal dd= new BigDecimal(5555);
//        dd.setScale(5,BigDecimal.ROUND_HALF_UP);
//        dd.setScale(5,BigDecimal.ROUND_DOWN);
//        dd.doubleValue();
    }
}
