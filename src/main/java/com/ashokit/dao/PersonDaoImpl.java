package com.ashokit.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class PersonDaoImpl implements UserDao {
	
	
	public PersonDaoImpl() {
		System.out.println("constructor::called");
	}
	public String findNameById(Integer id) {
		System.out.println("PersonDoImpl::method called()");
		if(id==101) {
			return"ram";
		}else if(id==102) {
			return "sita";
			
		}
		return null;
	}
}
