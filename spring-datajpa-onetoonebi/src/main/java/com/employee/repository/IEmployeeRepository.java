package com.employee.repository;

import com.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findByDepartment(String department);
    List<Employee> findByBiAddressCity(String city);
    @Query("from Employee e inner join e.biAddress a where e.department=?1 and a.city=?2")
    List<Employee> findByDepartAndCity(String dept,String city);
    @Query("from Employee e inner join e.biAddress a where a.state=?1 ")
    List<Employee> findByState(String state);
}
