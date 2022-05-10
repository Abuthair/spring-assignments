package com.employee.service;

import com.employee.model.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int employeeId);
    Employee getById(int employeeId);

    List<Employee> getAll();
    List<Employee> getByDepartment(String department);
    List<Employee> getByCity(String city);
    List<Employee> getByDepartAndCity(String dept,String city);
    List<Employee> getByState(String state);
}
