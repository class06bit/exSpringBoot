package com.hb.repo;

import java.sql.SQLException;
import java.util.List;

public interface GuestDao {

	public List<GuestVo> selectAll() throws SQLException;
}
