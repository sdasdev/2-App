package com.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	
	
	public UserDaoImpl() {
		System.out.println("UserDaoImpl::Constructor");
	}

	public String findNameById(Integer id) {
System.out.println("UserDaoImpl::method called()");
		if (id == 101) {
			return "sd";

		} else if (id == 102) {
			return "si";
		}
		return null;
	}

}
