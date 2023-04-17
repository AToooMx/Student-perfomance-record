package com.spr.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spr.api.Loggs;

@Repository
public class LoggDAOImpl implements LoggDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Loggs> getLoggs() {

		String sql = "SELECT * FROM Loggs order by date desc LIMIT 10";

		List<Loggs> loggs = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Loggs>(Loggs.class));

		return loggs;
	}

	@Override
	public void addLoggs(String logg) {

		String sql = "INSERT INTO Loggs (info) VALUE (?)";

		jdbcTemplate.update(sql, logg);

	}

}
