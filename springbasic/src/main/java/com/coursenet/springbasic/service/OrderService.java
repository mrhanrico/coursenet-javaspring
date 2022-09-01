package com.coursenet.springbasic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursenet.springbasic.dto.OrderRequestDTO;
import com.coursenet.springbasic.dto.OrderResponseDTO;
import com.coursenet.springbasic.entity.Orders;
import com.coursenet.springbasic.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	
	public OrderResponseDTO createOrder(OrderRequestDTO orderRequest) {
		
		//1. Ngambil dari request DTO
		Orders order = new Orders();
		
		//2. Mapping ke ORM
		order.setGoodsName(orderRequest.getGoodsName());
		
		//3. Save
		order = orderRepository.save(order);
		
		OrderResponseDTO orderRespone = new OrderResponseDTO(order);
		
		return orderRespone;
	}

}
