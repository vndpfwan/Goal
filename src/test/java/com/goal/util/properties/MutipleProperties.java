package com.goal.util.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MutipleProperties implements Runnable{
	private final Logger LOG = LoggerFactory.getLogger(MutipleProperties.class);
	public void run() {
//		System.out.println(Thread.currentThread()+" get the result:a");
		LOG.info(Thread.currentThread()+" get the result:"+CommonConfigProperties.getHomepageSliderSerialId());
	}
	
	public static void main(String[] args) {
		System.out.println("Start test");
		Thread[] tArr = new Thread[10];
		for (int i = 0; i < tArr.length; i++) {
			tArr[i] = new Thread(new MutipleProperties());
			tArr[i].start();
		}
	}
}
