package com.hb;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Boot01ApplicationTests {
	
	@Autowired
	DataSource ds;

	@Test
	public void contextLoads() {
	}

	@Test
	public void connectionTest() throws SQLException {
		assertNotNull(ds);
		try(Connection conn = ds.getConnection()){
		assertNotNull(conn);
		assertFalse(conn.isClosed());
		}
	}
}
