package com.springboot.datamongodb.controller;


import java.net.URI;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.TypedAggregation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;
import com.springboot.datamongodb.model.Dashboard;
//import com.springboot.datamongodb.model.distinctDashboard;
import com.springboot.datamongodb.repository.DashboardMongoRepository;
import com.mongodb.client.AggregateIterable;
/*import com.in28minutes.springboot.model.Course;
import com.in28minutes.springboot.model.Dashboard;
import com.in28minutes.springboot.service.DashboardService;
import com.in28minutes.springboot.service.StudentService;;*/
import com.springboot.datamongodb.SpringDataMongoDbApplication;

@RestController
@RequestMapping("/Dashboard")

public class Dashboardcontroller {
	//private DashboardMongoRepository Dashboardrepo;
	SpringDataMongoDbApplication objdashboard = new SpringDataMongoDbApplication();
	
	
	@GetMapping("/browser")
	public AggregateIterable<Document>  getBrowser() {
	AggregateIterable<Document> objbrowser = objdashboard.getBrowser();
	return objbrowser;
	}
	
	
	@GetMapping("/country")
	public AggregateIterable<Document>  getCountry() {
		AggregateIterable<Document> objcountry = objdashboard.getCountry();
		return objcountry;
		}
	
	@GetMapping("/language")
	public AggregateIterable<Document>  getLanguage() {
		AggregateIterable<Document> objlanguage = objdashboard.getLanguage();
		return objlanguage;
		}
	
	@GetMapping("/device")
	public AggregateIterable<Document>  getDevice() {
		AggregateIterable<Document> objdevice = objdashboard.getDevice();
		return objdevice;
		}
	
	@GetMapping("/os")
	public AggregateIterable<Document>  getOs() {
		AggregateIterable<Document> objos = objdashboard.getOs();
		return objos;
		}
	
	
	/*@GetMapping("/browser/{id}")
	public List<Dashboard> getByIdBetween(@PathVariable("id") String id){
	List<Dashboard> dashboard = this.Dashboardrepo.findByIdBetween();
	return dashboard;
	
	}*/



}
	
	
