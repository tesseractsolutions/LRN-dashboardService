/*package com.springboot.datamongodb.model;

import java.util.Arrays;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class distinctDashboard {
	
	MongoClient mongoClient = new MongoClient();
    MongoDatabase database = mongoClient.getDatabase("test");
    MongoCollection<Document> collection = database.getCollection("dashboard");
	
	public AggregateIterable<Document>  getBrowser() {
		
		AggregateIterable<Document> dbrowser = collection.aggregate(Arrays.asList(
					new Document("$project", new Document("_id", 1)
	    	                    .append("browser", "$Dashboard.browser")),
	    	                   // .append("date", "$views.date"))
	    	        new Document("$match", new Document("_id", "2017-02-22")),
                    new Document("$group", new Document("_id","distinctBrowser")
                               .append("browsers",new Document("$addToSet","$browser")))));
		
		 for (Document dbObject : dbrowser )
	      {
	          System.out.println(dbObject);
	      }
		 
	return dbrowser;
	
	}
 
public AggregateIterable<Document>  getCountry() {
		
		AggregateIterable<Document> dcountry = collection.aggregate(Arrays.asList(
	    	        new Document("$project", new Document("_id", 1)
	    	                    .append("country", "$Dashboard.country")),
	    	                   // .append("date", "$views.date"))
	    	        new Document("$match", new Document("_id", "2017-02-22")),
                    new Document("$group", new Document("_id","distinctCountry")
                               .append("country",new Document("$addToSet","$country")))));
		

		 for (Document dbObject : dcountry )
	      {
	          System.out.println(dbObject);
	      }
	return dcountry;
	}
	
public AggregateIterable<Document>  getLanguage() {
	
	AggregateIterable<Document> dlanguage = collection.aggregate(Arrays.asList(
    	       new Document("$project", new Document("_id", 1)
    	                    .append("language", "$Dashboard.language")),
    	                   // .append("date", "$views.date"))
    	        new Document("$match", new Document("_id", "2017-02-22")),
                new Document("$group", new Document("_id","distinctLanguage")
                           .append("language",new Document("$addToSet","$language")))));

	 for (Document dbObject : dlanguage )
     {
         System.out.println(dbObject);
     }
return dlanguage;
}
	
public AggregateIterable<Document>  getDevice() {
	
	AggregateIterable<Document> ddevice = collection.aggregate(Arrays.asList(
    	        new Document("$project", new Document("_id", 1)
    	                    .append("device", "$Dashboard.device")),
    	                   // .append("date", "$views.date"))
    	        new Document("$match", new Document("_id", "2017-02-22")),
                new Document("$group", new Document("_id","distinctDevice")
                           .append("device",new Document("$addToSet","$device")))));

	 for (Document dbObject : ddevice )
     {
         System.out.println(dbObject);
     }
return ddevice;
}
	
}
*/