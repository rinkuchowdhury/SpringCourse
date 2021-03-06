package spring.mvc.demo.dao;

import java.util.List;

import spring.mvc.demo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int cId);

	public void deleteCustomer(int cId);

	public List<Customer> searchCustomersByName(String searchName);

	
	
}
