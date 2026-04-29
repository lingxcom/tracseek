package com.lingx.jt808.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lingx.service.StartupService;

public class AppDocker {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring_docker.xml" });
		StartupService bean = context.getBean(StartupService.class);
		bean.startup();
		
	}
}
