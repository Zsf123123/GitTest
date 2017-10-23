package com.itheima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.Interface.Interface1;

@Component
@RequestMapping("/index")
public class Controller {
	
	//开始引入Service层
	@Autowired
	private Interface1 ServiceImpl;
	
		@RequestMapping("/demo1.action")
		public String demo1(){
		//调用ServiceImpl的开始调用findAll()
			ServiceImpl.findAll();
			return "  ";
		}

}
