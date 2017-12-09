package com.javasampleapproach.datamongodb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javasampleapproach.datamongodb.model.Dashboard;
import com.javasampleapproach.datamongodb.repository.DashboardMongoRepository;

@SpringBootApplication
public class SpringDataMongoDbApplication implements CommandLineRunner{
	
	@Autowired
	DashboardMongoRepository customerRepo;

	public static void main(String[] args) {
		
		SpringApplication.run(SpringDataMongoDbApplication.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		
	
		
		/**
		 * Find All customer
		 */
		System.out.println("----------------Show All records from dashboard collection!");
		List<Dashboard> customers = customerRepo.findAll();
		customers.forEach(System.out::println);
	}
}
