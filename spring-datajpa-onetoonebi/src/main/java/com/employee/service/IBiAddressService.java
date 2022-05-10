package com.employee.service;

import com.employee.model.BiAddress;

import java.util.List;

public interface IBiAddressService {
    List<BiAddress> getByName(String employeeName);
    List<BiAddress> getByDepartment(String dept);
    List<BiAddress> getByNameAndCity(String name,String city);
    BiAddress getById(int employeeId);
    List<BiAddress> getByNameAndZipcode(String name,long zipcode);
    List<BiAddress> getByCity(String city);
}
