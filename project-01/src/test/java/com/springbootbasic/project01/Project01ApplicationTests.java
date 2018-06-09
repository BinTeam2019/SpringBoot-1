package com.springbootbasic.project01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.regex.Pattern;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Project01ApplicationTests {
    private TestRestTemplate template = new TestRestTemplate();

    private static int port = 8080;

    @Test
    public void contextLoads() {
        String url = "http://localhost:" + port + "/";
        String result = template.getForObject(url,String.class);
        System.err.println(result);
    }
    @Test
    public void testhello(){
        String url = "http://localhost:" + port + "/hello";
        String result = template.getForObject(url,String.class);
        System.err.println(result);
    }
}
