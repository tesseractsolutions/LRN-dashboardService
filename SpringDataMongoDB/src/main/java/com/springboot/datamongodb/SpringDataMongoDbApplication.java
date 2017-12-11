package com.springboot.datamongodb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.datamongodb.model.Dashboard;
import com.springboot.datamongodb.model.db_detail;
import com.springboot.datamongodb.repository.DashboardMongoRepository;

@SpringBootApplication
public class SpringDataMongoDbApplication {
	
	/*@Autowired
	DashboardMongoRepository DashboardRepo;*/

	public static void main(String[] args) {
		SpringApplication.run(SpringDataMongoDbApplication.class, args);
	}
	
	
}
