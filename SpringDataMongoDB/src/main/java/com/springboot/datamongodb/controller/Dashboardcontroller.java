package com.springboot.datamongodb.controller;


import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.springboot.datamongodb.model.Dashboard;
import com.springboot.datamongodb.repository.DashboardMongoRepository;

/*import com.in28minutes.springboot.model.Course;
import com.in28minutes.springboot.model.Dashboard;
import com.in28minutes.springboot.service.DashboardService;
import com.in28minutes.springboot.service.StudentService;;*/

@RestController
@RequestMapping("/Dashboard")

public class Dashboardcontroller {
	private DashboardMongoRepository Dashboardrepo;
	
	public Dashboardcontroller(DashboardMongoRepository Dashboardrepo){
		this.Dashboardrepo = Dashboardrepo;
	}
	
	@GetMapping("/page1")
	public List<Dashboard> getAll(){
	List<Dashboard> dashboard = this.Dashboardrepo.findAll();
	return dashboard;
	
	}
	
	@GetMapping("/{id}")
	public List<Dashboard> getById(@PathVariable("id") String id){
	List<Dashboard> dashboard = this.Dashboardrepo.findById(id);
	return dashboard;
	
	}
	
	/*@GetMapping("/browser/{id}")
	public List<Dashboard> getByIdBetween(@PathVariable("id") String id){
	List<Dashboard> dashboard = this.Dashboardrepo.findByIdBetween();
	return dashboard;
	
	}*/



}
	
	
