package com.springboot.datamongodb.model;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.client.AggregateIterable;

import java.util.ArrayList;

//@Document(collection="dashboard")

public class DashboardNew {
	
	private List<id_detail> id;
	private int users;
	private int sessions;
	
	
	
	
	protected DashboardNew() { this.id = new ArrayList<>();}

	public DashboardNew (List<id_detail> DashboardNew , int users, int sessions ) {
		super();
		this.id = id;
		this.users = users;
		this.sessions = sessions;
	}
	

	public int getUsers() {
		return users;
	}

	

	public int getSessions() {
		return sessions;
	}
	public List<id_detail> getId() {
		return id;
	}

	public void setId(List<id_detail> id) {
		this.id = id;
	}
	/*public void setDashboard(List<db_detail> Dashboard) {
		this.Dashboard = Dashboard;
	}
*/	
	@Override
	public String toString() {
		return String.format(
				"DashboardNew [users=%i, sessions=%i, id=%s]", id ,users,sessions);
	}


	/*distinctDashboard objdashboard = new distinctDashboard();
	AggregateIterable<Document> objbrowser = objdashboard.getBrowser();
	objdashboard.getCountry();
	objdashboard.getLanguage();
	objdashboard.getDevice();*/
	
	
	
	
	
	
	
	
	
}
