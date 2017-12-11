package com.springboot.datamongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.datamongodb.model.Dashboard;
@Repository
public interface DashboardMongoRepository extends MongoRepository<Dashboard, String>{
	//List<Dashboard> findByid();
	
	List<Dashboard> findById(String id);
}
