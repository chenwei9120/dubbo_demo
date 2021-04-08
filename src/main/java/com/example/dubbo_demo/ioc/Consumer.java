package com.example.dubbo_demo.ioc;

import com.example.dubbo_demo.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class Consumer {

	public static void main(String[] args) {
		//SpringApplication.run(Consumer.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/consumer.xml"});
		context.start();
		HelloService helloService = (HelloService)context.getBean("helloService");
		String result = helloService.sayHello("Baby");
		System.out.println(result);
	}
}
