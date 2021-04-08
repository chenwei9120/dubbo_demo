package com.example.dubbo_demo.ioc2;

import com.example.dubbo_demo.service.CountService;
import com.example.dubbo_demo.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CompletableFuture;

//@SpringBootApplication
public class Consumer {

	public static void main(String[] args) throws InterruptedException {
		//SpringApplication.run(Consumer.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/consumer.xml"});
		context.start();
		CountService countService = (CountService)context.getBean("countService");
		CompletableFuture<Integer> future = countService.getCount(100L);
		future.whenComplete((v, t) -> {
			if (t != null) {
				t.printStackTrace();
			} else {
				System.out.println("Response: " + v);
			}
		});
	}
}
