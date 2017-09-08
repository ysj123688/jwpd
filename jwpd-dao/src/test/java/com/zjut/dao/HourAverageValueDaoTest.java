package com.zjut.dao;

import com.zjut.dao.statistic.HourAverageValueDao;
import com.zjut.model.AverageValue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

/**
 * @author yuanweipeng
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")

public class HourAverageValueDaoTest {

    @Autowired
    private HourAverageValueDao hourAverageValueDao;


    @Test
    public void getTest() {
        Date startTime = new Date();
        Map<String, Object> params = new HashMap<>();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        Date endTime  =calendar.getTime();
        params.put("startTime",startTime);
        params.put("endTime",endTime);
        List<AverageValue> list = hourAverageValueDao.get(params);
        for (AverageValue averageValue : list){
            System.out.println(averageValue);
        }

    }

    @Test
    public void insertTest(){
        AverageValue averageValue = new AverageValue();
        averageValue.setAverageVaule(12);
        averageValue.setCreatedTime(new Date());
        hourAverageValueDao.insert(averageValue);
    }

    @Test
    public void logTest(){
        Logger logger = LoggerFactory.getLogger(HourAverageValueDaoTest.class);
        logger.error("logger test.xml");
    }
}
