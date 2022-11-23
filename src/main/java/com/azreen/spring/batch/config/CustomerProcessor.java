package com.azreen.spring.batch.config;

import org.springframework.batch.item.ItemProcessor;

import com.azreen.spring.batch.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer customer) throws Exception {
		
		//only get record with country=United States
		if(customer.getCountry().equals("United States")) {
			return customer;
		}else {
			return null;
		}
		
	}

}
