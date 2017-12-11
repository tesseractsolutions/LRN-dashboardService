package com.springboot.datamongodb.model;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;

//@Document(collection="dashboard")

public class Dashboard {
	private String id;
	private List<db_detail> Dashboard;
	
	protected Dashboard() { this.Dashboard = new ArrayList<>();}

	public Dashboard (String id, List<db_detail> Dashboard) {
		super();
		this.id = id;
		this.Dashboard = Dashboard;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<db_detail> getDashboard() {
		return Dashboard;
	}

	/*public void setDashboard(List<db_detail> Dashboard) {
		this.Dashboard = Dashboard;
	}
*/	
	/*@Override
	public String toString() {
		return String.format(
				"Dashboard [id=%s, Dashboard=%s]", id,Dashboard);
	}
*/

	
	
	
	
	
	
	
	
	
	
}
