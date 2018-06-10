package com.springbootbasic.project02;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Project02ApplicationTests {
    @Autowired
    TestProperties testProperties;

    @Test
    public void contextLoads() {
    }

    @Test
    public void TestP(){
        Assert.assertEquals(testProperties.getTest(),"binbin2018");
        System.err.println(testProperties.getTestInt().toString());
        System.err.println(testProperties.getTestUUID());
    }
}
