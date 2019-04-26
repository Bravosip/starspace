package com.summer.starspace;

import com.summer.starspace.dto.StarProperties;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class StarPropertiesTests {
    @Autowired
    private StarProperties starProperties;

    @Test
    public void testProperties(){
        Assert.assertEquals(starProperties.getName(),"程序猿GG");
        Assert.assertEquals(starProperties.getTitle(),"Spring Boot学习");
        log.info(starProperties.getDesc());
        log.info(starProperties.getValue());
        log.info(starProperties.getNumber());
        log.info(starProperties.getBignumber());
        log.info(starProperties.getTest1());
        log.info(starProperties.getTest2());
    }
}
