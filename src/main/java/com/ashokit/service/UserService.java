package com.ashokit.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ashokit.dao.ReportDao;
//import com.ashokit.dao.ReportDao;
import com.ashokit.dao.UserDao;

@Service
public class UserService {
	
	@Autowired(required = false)
	@Qualifier("udao") 
	private UserDao userDao;


	

	public void printUserName(Integer id) {
		String name= userDao.findNameById(id);
		System.out.println(name);
	}
}
