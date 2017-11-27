package com.hb;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hb.repo.GuestDao;
import com.hb.repo.GuestVo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Boot02ApplicationTests {
	
	@Autowired
	DataSource ds;
	@Autowired
	GuestDao dao;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void connectionTest(){
		assertNotNull(ds);
	}
	
	@Test
	public void selectAllTest() throws SQLException{
		List<GuestVo> list = dao.selectAll();
		assertNotNull(list);
		assertTrue(list.size()>0);
	}

}
