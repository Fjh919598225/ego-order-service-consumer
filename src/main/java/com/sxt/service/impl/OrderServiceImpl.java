package com.sxt.service.impl;

import java.util.List;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.sxt.domain.UserAddress;
import com.sxt.service.OrderService;
import com.sxt.service.UserService;

@Service
public class OrderServiceImpl implements OrderService {

	@Reference
	private UserService userService; //<!-- 生成远程调用对象 -->
	
//	public void setUserService(UserService userService) {
//		this.userService = userService;
//	}

	@Override
	public List<UserAddress> initOrder(String userId) {
		return userService.queryAllAddress(userId);
	}

}
