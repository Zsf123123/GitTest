package com.itheima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.Interface.Interface1;

@Component
@RequestMapping("/index")
public class Controller {
	
	//��ʼ����Service��
	@Autowired
	private Interface1 ServiceImpl;
	
		@RequestMapping("/demo1.action")
		public String demo1(){
		//����ServiceImpl�Ŀ�ʼ����findAll()
			ServiceImpl.findAll();
			return "  ";
		}

}
