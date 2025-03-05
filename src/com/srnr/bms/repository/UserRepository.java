package com.srnr.bms.repository;

@SuppressWarnings("serial")
public class UserRepository extends RuntimeException{
	
	public UserRepository(String msg) {
		super(msg);
	}
	
	public void saveUser()
	{
		System.out.println("User saved");
	}

}
