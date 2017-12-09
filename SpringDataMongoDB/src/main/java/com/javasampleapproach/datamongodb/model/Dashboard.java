package com.javasampleapproach.datamongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection="dashboard")
public class Dashboard {
	@Id
	private String id;
	
	private List<String> Dashboard;
	//private int age;
	
	

	/*public Dashboard(String id, String[] Dashboard){
		this.id = id;
		this.Dashboard = Dashboard;
	}*/
	
	public String getId(){
		return this.id;
	}
	public String setId(){
		return this.id;
	}
	public List<String> getDashboard(){
		return this.Dashboard;
	}
	public List<String> setDashboard(){
		return this.Dashboard;
	}
	
	
	public String toString(){
		String info = String.format("{'id': %s , 'Dashboard': %s}", id, Dashboard);
		return info;
	}
}