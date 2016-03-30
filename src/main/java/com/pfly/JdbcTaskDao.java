package com.pfly;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcTaskDao implements TaskDAO{

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void insert(Task task) {
		int a = 1;
	}

	@Override
	public String getDescrById(long id) {
		String descr = jdbcTemplate.queryForObject(String.format("SELECT description FROM task WHERE task_id = %s", id), String.class);
		return new String("The description of task with id: " + id + "is: " + descr);
	}

}
