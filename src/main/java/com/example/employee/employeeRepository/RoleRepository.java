package com.example.employee.employeeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.employee.employeeEntity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Role findByName(String name);
	
}
