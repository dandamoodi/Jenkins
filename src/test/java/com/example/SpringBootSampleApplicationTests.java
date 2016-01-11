package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootSampleApplication.class)
@WebAppConfiguration
public class SpringBootSampleApplicationTests {

	@Test
	public void contextLoads() {
        Assert.assertTrue(false);
	}
    
    @Test
    public void testMethodTwo(){
	Assert.assertTrue(true);
    }


}
