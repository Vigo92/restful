package com.vigo.restful.database;

import java.util.HashMap;
import java.util.Map;

import com.vigo.restful.model.Customer;

public class Databaase {
	
	
	
private static	Map<Integer, Customer> customer = new HashMap<Integer, Customer>();
	
	
	public static Map<Integer,Customer> getCustomer(){
		
		
		   return customer;
	}

}
