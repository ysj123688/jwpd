package com.zjut.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author yuanweipeng
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath*:spring-task.xml")
public class TaskTest {

    @Autowired
    private DataFactory factory;


   @Test
    public void taskTest(){
       factory.dataFactory();
   }


}
