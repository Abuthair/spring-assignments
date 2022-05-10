package com.employee.service;

import com.employee.model.Employee;
import com.employee.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements  IEmployeeService{
    IEmployeeRepository iEmployeeRepository;
    @Autowired
    public void setiEmployeeRepository(IEmployeeRepository iEmployeeRepository) {
        this.iEmployeeRepository = iEmployeeRepository;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return iEmployeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
       iEmployeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(int employeeId) {
       iEmployeeRepository.deleteById(employeeId);
    }

    @Override
    public Employee getById(int employeeId) {
        return iEmployeeRepository.findById(employeeId).get();
    }

    @Override
    public List<Employee> getAll() {
        return iEmployeeRepository.findAll();
    }

    @Override
    public List<Employee> getByDepartment(String department) {
        return iEmployeeRepository.findByDepartment(department);
    }

    @Override
    public List<Employee> getByCity(String city) {
        return iEmployeeRepository.findByBiAddressCity(city);
    }

    @Override
    public List<Employee> getByDepartAndCity(String dept, String city) {
        return iEmployeeRepository.findByDepartAndCity(dept,city);
    }

    @Override
    public List<Employee> getByState(String state) {
        return iEmployeeRepository.findByState(state);
    }
}
