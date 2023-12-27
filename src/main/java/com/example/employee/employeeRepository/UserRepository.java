package com.example.employee.employeeRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.employeeEntity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
