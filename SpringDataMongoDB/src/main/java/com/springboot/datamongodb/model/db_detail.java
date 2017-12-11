package com.springboot.datamongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection="customer")


public class db_detail {
	//@Id
	private String browser;
	private String device;
	private String os;
	private String country;
	private String language;
	private int users;
	private int sessions;
	
	
	protected db_detail() {
		
	}
	
	
	public db_detail(String browser, String device, String os, String country,String language,int users, int sessions){
		this.browser = browser;
		this.device = device;
		this.os = os;
		this.country = country;
		this.language = language;
		this.users = users;
		this.sessions = sessions;
	}
	
	
	public String getbrowser(){
		return this.browser;
	}

	public String getdevice(){
		return this.device;
	}


	public String getos(){
		return this.os;
	}


	public String getcountry(){
		return this.country;
	}


	public String getlanguage(){
		return this.language;
	}

	public int getusers(){
		return this.users;
	}
	
	public int getsessions(){
		return this.sessions;
	}
	/*
	public String toString(){
		String info = String.format("{'id': %s 'name': %s, 'age': %d}", id, name, age);
		return info;
	}*/
}