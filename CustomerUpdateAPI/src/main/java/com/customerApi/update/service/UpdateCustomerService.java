package com.customerApi.update.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerApi.update.modal.Customer;
import com.customerApi.update.repository.CustomerUpdateRepository;

@Service
public class UpdateCustomerService {
	private static final Logger logger = LoggerFactory.getLogger(UpdateCustomerService.class);
	
	@Autowired
	CustomerUpdateRepository repo;
	
	public Customer updateCustomer(Customer  data)
	{
		repo.save(data);
		logger.info("Record has been updated successfully"+data);
		return data;
	}

}
