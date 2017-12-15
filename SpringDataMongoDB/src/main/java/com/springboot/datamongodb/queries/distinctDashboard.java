package com.springboot.datamongodb.queries;
//package com.springboot.datamongodb.model;

import java.util.Arrays;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.springboot.datamongodb.dbConnection;

public class distinctDashboard {
	
//	MongoClient mongoClient = new MongoClient();
//    MongoDatabase database = mongoClient.getDatabase("test");
//    MongoCollection<Document> collection = database.getCollection("dashboard");
	
	
    
    private dbConnection db = new dbConnection();
    MongoClient mongoClient = db.GetDBConnection();
  
    //MongoDatabase database  = mongoClient.getDatabase(")
    MongoCollection<Document> collection = mongoClient.getDatabase("analytics").getCollection("Dashboard");
    
    
    //.................................DistinctBrowser.....................................
        public AggregateIterable<Document>  getBrowser(String fromdate, String todate) {
    	
    	AggregateIterable<Document> distinctBrowser = collection.aggregate(Arrays.asList(
               // new Document("$match", new Document("_id", fromdate)),    
                new Document("$project", new Document("_id", 0)
                                .append("browser", "$_id.browser")),
                   //  new Document("$match", new Document("_id", fromdate)),
                    new Document("$group", new Document("_id","distinctBrowsers")
                               .append("browsers",new Document("$addToSet","$browser"))),
                    new Document("$project", new Document("_id", 0)
    				           .append("distinctBrowsers", "$browsers"))));
         for (Document dbObject : distinctBrowser )
          {
              System.out.println(dbObject);
          }
         
    return distinctBrowser;

    }
      //.................................DistinctCountry.....................................
 
        public AggregateIterable<Document>  getCountry(String fromdate, String todate) {
        	   AggregateIterable<Document> distinctCountry = collection.aggregate(Arrays.asList(
        	           new Document("$match", new Document("_id", fromdate)),    
        	           new Document("$project", new Document("_id", 0)
        	                           .append("country", "$_id.country")),
        	               new Document("$group", new Document("_id","distinctBrowsers")
        	                          .append("browsers",new Document("$addToSet","$country"))),
        	               new Document("$project", new Document("_id", 0)
        	          .append("distinctCountry", "$country"))));
        	    for (Document dbObject : distinctCountry )
        	     {
        	         System.out.println(dbObject);
        	     }
        	   
        	return distinctCountry;

        	}
      //.................................DistinctLanguage.....................................
        public AggregateIterable<Document>  getLanguage(String fromdate, String todate) {
 		   AggregateIterable<Document> distinctLanguage = collection.aggregate(Arrays.asList(
 		           new Document("$match", new Document("_id", fromdate)),    
 		           new Document("$project", new Document("_id", 0)
 		                           .append("language", "$_id.language")),
 		               new Document("$group", new Document("_id","distinctlanguage")
 		                          .append("language",new Document("$addToSet","$language"))),
 		               new Document("$project", new Document("_id", 0)
 		          .append("distinctlanguages", "$os"))));
 		    for (Document dbObject : distinctLanguage )
 		     {
 		         System.out.println(dbObject);
 		     }
 		   
 		return distinctLanguage;

 		}
      //.................................DistinctOs.....................................
	public AggregateIterable<Document>  getOs(String fromdate, String todate) {
		   AggregateIterable<Document> distinctOs = collection.aggregate(Arrays.asList(
		           new Document("$match", new Document("_id", fromdate)),    
		           new Document("$project", new Document("_id", 0)
		                           .append("os", "$_id.os")),
		               new Document("$group", new Document("_id","distinctOs")
		                          .append("os",new Document("$addToSet","$os"))),
		               new Document("$project", new Document("_id", 0)
		          .append("distinctos", "$os"))));
		    for (Document dbObject : distinctOs )
		     {
		         System.out.println(dbObject);
		     }
		   
		return distinctOs;

		}
	//.................................DistinctDevice.....................................
	public AggregateIterable<Document>  getDevice(String fromdate, String todate) {
		   AggregateIterable<Document> distinctDevice = collection.aggregate(Arrays.asList(
		           new Document("$match", new Document("_id", fromdate)),    
		           new Document("$project", new Document("_id", 0)
		                           .append("device", "$_id.device")),
		               new Document("$group", new Document("_id","distinctDevice")
		                          .append("device",new Document("$addToSet","$device"))),
		               new Document("$project", new Document("_id", 0)
		          .append("distinctdevice", "$device"))));
		    for (Document dbObject : distinctDevice )
		     {
		         System.out.println(dbObject);
		     }
		   
		return distinctDevice;
		}
	
	//.................................DistinctCompany.....................................
	public AggregateIterable<Document>  getCompany(String fromdate, String todate) {
		   AggregateIterable<Document> distinctCompany = collection.aggregate(Arrays.asList(
		           new Document("$match", new Document("_id", fromdate)),    
		           new Document("$project", new Document("_id", 0)
		                           .append("company", "$_id.company")
		.append("companySites", "$companySites.site")),
	//	new Document("$unwind", new Document("$companySites")),
		               new Document("$group", new Document("_id","Company")
		                          .append("companySites",new Document("$addToSet","$companySites"))),
		               new Document("$project", new Document("_id", 0)
		          .append("company", "$_id")
		  .append("companySites","$companySites"))));
		    for (Document dbObject : distinctCompany )
		     {
		         System.out.println(dbObject);
		     }
		   
		return distinctCompany;
		}
	
	
}
