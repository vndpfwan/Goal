package com.goal.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
/**
 * spring boot entrance
 * @author lizhiwei
 *
 */
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	/**
	 * change the container to Jetty
	 * @return
	 */
	@Bean
	public EmbeddedServletContainerFactory servletContainer() {
		return new JettyEmbeddedServletContainerFactory();
	}
	
}
