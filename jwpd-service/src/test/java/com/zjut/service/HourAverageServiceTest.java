package com.zjut.service;

import com.zjut.model.AverageValue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * @author yuanweipeng
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-service.xml")
public class HourAverageServiceTest {

    @Autowired
    private HourAverageService hourAverageService;

    @Test
    public void getTest(){
        AverageValue averageValue = new AverageValue();
        averageValue.setAverageVaule(12);
        averageValue.setCreatedTime(new Date());
        hourAverageService.insert(averageValue);
    }

}
