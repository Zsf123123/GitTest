package com.itheima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheim.mapper.Mapper;
import com.itheima.Interface.Interface1;

@Service
public class ServiceImpl implements Interface1{

	
	//导入dao层
	@Autowired
	private  Mapper mapper;
	
	public void findAll() {

		mapper.findAll();
		
		
	}

	
	
	
	
}
