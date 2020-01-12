package com.sxt.test;

import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sxt.domain.UserAddress;
import com.sxt.service.OrderService;

public class TestConsumer {
	public static void main(String[] args) throws IOException {
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext2.xml");
		//从IOC里面得到OrderServiceImpl
		OrderService orderService = context.getBean(OrderService.class);
		List<UserAddress> list = orderService.initOrder("张三01");
		for (UserAddress userAddress : list) {
			System.out.println(userAddress.getUserId()+"  "+userAddress.getUserAddress());
		}
		
		System.in.read();
		
	}
}
