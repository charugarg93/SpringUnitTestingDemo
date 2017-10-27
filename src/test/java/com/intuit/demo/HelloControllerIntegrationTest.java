package com.intuit.demo;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerIntegrationTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void sum() throws Exception{
        int requiredOutput = 30;
        int actualOutput=-1;
       actualOutput = testRestTemplate.getForObject("/sum/10/20", Integer.class);
       assertTrue(requiredOutput == actualOutput);
    }


}
