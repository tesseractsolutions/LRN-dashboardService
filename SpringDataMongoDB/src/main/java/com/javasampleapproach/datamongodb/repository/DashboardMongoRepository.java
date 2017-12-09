package com.javasampleapproach.datamongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javasampleapproach.datamongodb.model.Dashboard;

public interface DashboardMongoRepository extends MongoRepository<Dashboard, String>{
	List<Dashboard> findByDashboard();
}
