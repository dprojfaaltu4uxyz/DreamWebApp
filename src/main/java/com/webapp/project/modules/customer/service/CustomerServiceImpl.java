package com.webapp.project.modules.customer.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.customer.dao.CustomerDao;
import com.webapp.project.modules.customer.model.Customer;

public class CustomerServiceImpl implements CustomerService{

	private CustomerDao customerDao;
	 
    public void setCustomerDAO(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
 
    @Override
    @Transactional
    public void addCustomer(Customer c) {
        this.customerDao.addCustomer(c);
    }
 
    @Override
    @Transactional
    public void updateCustomer(Customer c) {
        this.customerDao.updateCustomer(c);
    }
 
    @Override
    @Transactional
    public List<Customer> listCustomers() {
        return this.customerDao.listCustomers();
    }
 
    @Override
    @Transactional
    public Customer getCustomerById(int id) {
        return this.customerDao.getCustomerById(id);
    }
 
    @Override
    @Transactional
    public void removeCustomer(int id) {
        this.customerDao.removeCustomer(id);
    }
}
