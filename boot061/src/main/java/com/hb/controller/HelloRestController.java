package com.hb.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hb.domain.model.GuestDaoImf;
import com.hb.domain.model.entity.GuestVo;

//@RestController
@Controller
public class HelloRestController {

	@Autowired
	private GuestDaoImf dao;
	
//	@RequestMapping("/")
//	public void index(){
//	}
	@RequestMapping("/hello")
	public String hello(){
		return "Hello Test";
	}
	
	@RequestMapping("/add")
	public String add(GuestVo bean){
//		return dao.save(bean);
		bean.setNalja(new Date(System.currentTimeMillis()));
		bean.setName("tester");
		bean.setPay(bean.getSabun());
		return "redirect:/guest/"+dao.save(bean).getSabun();
	}
	
	@RequestMapping("/list")
	public void list(Model model){
		List<GuestVo> list = dao.findAll();
		model.addAttribute("list",list);
	}

	@RequestMapping("/guest/{sabun}")
	public String view(Model model, @PathVariable int sabun){
		GuestVo bean = dao.findOne(sabun);
		model.addAttribute("bean",bean);
		return "redirect:/list";
	}
	
}







