package kr.ac.mjc.sungbin.spring.day1.class06.common;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper<T> {
	public T mapRow(ResultSet rs) throws SQLException;
}
