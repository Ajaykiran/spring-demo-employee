package com.example.employee.employeeService;

import java.util.List;
import com.example.employee.employeeDTO.UserDto;
import com.example.employee.employeeEntity.User;




public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}