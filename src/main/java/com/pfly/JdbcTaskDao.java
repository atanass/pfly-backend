package com.pfly;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTaskDao implements TaskDAO{

	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void insert(Task task) {
		
	}

	@Override
	public String getDescrById(long id) {
		String descr = jdbcTemplate.queryForObject(String.format("SELECT description FROM task WHERE task_id = %s", id), String.class);
		return new String("The description of task with id: " + id + "is: " + descr);
	}

}
