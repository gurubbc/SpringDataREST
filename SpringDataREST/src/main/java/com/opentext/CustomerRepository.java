package com.opentext;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	// No need to define any methods here, just leave it blank
	// Just for comparison purpose, this can be thought of as DAO class
}
