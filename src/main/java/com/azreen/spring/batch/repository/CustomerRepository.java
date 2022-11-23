package com.azreen.spring.batch.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.azreen.spring.batch.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>  {

}
