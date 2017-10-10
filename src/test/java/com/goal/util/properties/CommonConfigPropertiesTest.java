package com.goal.util.properties;

import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-mybatis.xml","classpath*:spring-mvc-servlet.xml" })
public class CommonConfigPropertiesTest {
	private final Logger LOG = LoggerFactory.getLogger(CommonConfigPropertiesTest.class);
	
	
	public void testGetHomepageSliderSerialId() throws InterruptedException {
		LOG.info("Start test");
		Thread[] tArr = new Thread[3];
		for (int i = 0; i < tArr.length; i++) {
			tArr[i] = new Thread(new MutipleProperties());
			tArr[i].start();
			tArr[i].join();//因为junit不支持多线程测试，此处使用join让主线程等待
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread()+" get the result:"+CommonConfigProperties.getHomepageSliderSerialId());
	}
}
