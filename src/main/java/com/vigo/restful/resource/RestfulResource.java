package com.vigo.restful.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.vigo.restful.model.Customer;
import com.vigo.restful.service.CustomerService;

@Path("/jo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestfulResource {
	
	CustomerService service = new CustomerService();
	
	
	@Path("/customers")
	@GET
	public List<Customer> getCustomers(){
		
		
		return service.getCustomers();
	}
	
	
	
	@Path("customer/{id}")
	@GET
	public Customer getCustomer(@PathParam("id") int id){
		
		
		return service.getCustomer(id);
	}
	
	@POST
	@Path("createcustomers")
	public Customer createCustomer(Customer customer){
		
		
		return service.createCustomer(customer);
	}
	
	@DELETE
	@Path("deletecustomer/{id}")
	public Response deleteCustomer(@PathParam("id") int id) {
		
		service.deleteCustomer(id);
		return Response.noContent().build();
	}

}
