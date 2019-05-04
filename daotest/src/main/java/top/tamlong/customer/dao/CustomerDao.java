package top.tamlong.customer.dao;

import top.tamlong.model.Customer;

public interface CustomerDao {
	public void insert(Customer customer);
	public Customer findByCustomerId(int id);
}
