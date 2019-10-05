package com.vigo.restful.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.vigo.restful.database.Databaase;
import com.vigo.restful.model.Customer;

public class CustomerService {
	
	
	
	Map<Integer , Customer> customer = Databaase.getCustomer();
	
	
	{
		
		customer.put(1,new Customer(1,"Obai Ufo","I love you", 23333));
		customer.put(2,new Customer(2,"Ajogy Ugo","I hate you", 9888));
		customer.put(3,new Customer(3,"OLoa  Loifo","I want you", 29083));
		customer.put(4,new Customer(4,"Poil Ufoma","I need you", 290821));
		customer.put(5,new Customer(5,"Nina Ofot","I okoa you", 90888));
		customer.put(6,new Customer(6,"Tacha Ufojo","I kien you", 129873));
		customer.put(7,new Customer(7,"Mercy Kolola","I lolpa you", 129803));
	}
	
	
	
	public List<Customer>  getCustomers(){
		
		
		return new ArrayList<Customer>(customer.values());
	}
	
	
	public Customer getCustomer(int id) {
		
		return customer.get(id);
	}
	
	public Customer createCustomer(Customer customers) {
		customers.setId(customer.size() + 1);
		customer.put(customers.getId(), customers);
		return customers;
	}
	
	public void deleteCustomer(int id) {
		
		customer.remove(id);
	}
}
