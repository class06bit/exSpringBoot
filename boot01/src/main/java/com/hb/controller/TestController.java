package com.hb.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hb.repo.GuestDao;
import com.hb.repo.GuestVo;

@RestController
public class TestController {
	@Autowired
	GuestDao dao;

	@RequestMapping("/main")
	public String mainPage() {
		return "Test main page";
	}
	
	@RequestMapping("/page01")
	@ResponseBody
	public GuestVo page01() {
		
		return new GuestVo();
	}
	@RequestMapping("/page02")
	public void page02() throws SQLException {
		List<GuestVo> list = dao.selectAll();
		list.forEach(x->System.out.println(x));
	}
	
}
