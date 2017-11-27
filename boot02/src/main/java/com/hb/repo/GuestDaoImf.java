package com.hb.repo;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class GuestDaoImf implements GuestDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<GuestVo> selectAll() throws SQLException{
		
		 List<GuestVo> list = jdbcTemplate.query(
	                "SELECT * FROM GUEST01",
	                (rs, rowNum) -> new GuestVo(rs.getInt("sabun"),
	                		rs.getString("name"), rs.getDate("nalja"), rs.getInt("pay"))
	        );
		
		return list;
		
	}
}
