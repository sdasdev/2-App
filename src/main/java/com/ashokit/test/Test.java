package com.ashokit.test;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception {
//IOC is loading userService class
		Class<?> clz = Class.forName("com.ashokit.test.User");
		// it is also creating the obj

		Object obj = clz.newInstance();

		// get the field value
		Field ageField = clz.getDeclaredField("age");
//set the field as Accessible
		ageField.setAccessible(true);

		ageField.set(obj, 30);// field injection
		// pass the userDao obj to that variable by calling the set method
		System.out.println("Age ::" + ageField.get(obj));

	}
}
