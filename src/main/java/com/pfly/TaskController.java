package com.pfly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

	@Autowired
	private JdbcTaskDao taskDao;
	
	@RequestMapping("/task")
	public String getTaskById(@RequestParam(value="id") long id){
		return taskDao.getDescrById(id);
	}
	
}
