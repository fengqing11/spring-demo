package top.tamlong.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import top.tamlong.customer.dao.CustomerDao;
import top.tamlong.model.Customer;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CustomerDao customerDao = (CustomerDao) context.getBean("customerDao");
		Customer customer = new Customer(2, "yiibai", 29);
		customerDao.insert(customer);

		Customer customer1 = customerDao.findByCustomerId(1);
		System.out.println(customer1);

	}
}
