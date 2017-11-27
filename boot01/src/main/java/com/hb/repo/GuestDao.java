package com.hb.repo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GuestDao {
	@Autowired
	private DataSource ds;
//	private JdbcTemplate jdbcTemplate;
	
	public List<GuestVo> selectAll() throws SQLException{
		
//		 List<GuestVo> list = jdbcTemplate.query(
//	                "SELECT * FROM GUEST01",
//	                (rs, rowNum) -> new GuestVo(rs.getInt("sabun"),
//	                		rs.getString("name"), rs.getDate("nalja"), rs.getInt("pay"))
//	        );
		List<GuestVo> list=null;
		list=new ArrayList<>();
		try(Connection conn=ds.getConnection()){
			ResultSet rs = conn.prepareStatement("select * from guest01").executeQuery();
			while(rs.next()){
				GuestVo bean = new GuestVo();
				bean.setSabun(rs.getInt("sabun"));
				bean.setName(rs.getString("name"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setPay(rs.getInt("pay"));
				list.add(bean);
			}
		}
		
		return list;
		
	}
}
