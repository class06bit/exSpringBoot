package com.hb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hb.domain.model.GuestDaoImf;
import com.hb.domain.model.entity.GuestVo;

@RestController
public class HelloRestController {

	@Autowired
	private GuestDaoImf dao;
	
	@RequestMapping("/hello")
	public String index(){
		return "Hello Test";
	}
	
	@RequestMapping("/add")
	public GuestVo add(GuestVo bean){
		return dao.save(bean);
	}
	
	@RequestMapping("/list")
	public List<GuestVo> list(Model model){
		return dao.findAll();
	}
}







