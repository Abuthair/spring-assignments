package com.employee.service;

import com.employee.model.BiAddress;
import com.employee.repository.IBiAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BiAddressServiceImpl implements  IBiAddressService{
    IBiAddressRepository iBiAddressRepository;

    public BiAddressServiceImpl(IBiAddressRepository iBiAddressRepository) {
        this.iBiAddressRepository = iBiAddressRepository;
    }

    @Override
    public List<BiAddress> getByName(String employeeName) {
        return iBiAddressRepository.findByName(employeeName);
    }

    @Override
    public List<BiAddress> getByDepartment(String dept) {
        return iBiAddressRepository.findByDepartment(dept);
    }

    @Override
    public List<BiAddress> getByNameAndCity(String name, String city) {
        return iBiAddressRepository.findByNameAndCity(name,city);
    }

    @Override
    public BiAddress getById(int employeeId) {
        return iBiAddressRepository.findById(employeeId);
    }

    @Override
    public List<BiAddress> getByNameAndZipcode(String name, long zipcode) {
        return iBiAddressRepository.findByNameAndZipcode(name,zipcode);
    }

    @Override
    public List<BiAddress> getByCity(String city) {
        return iBiAddressRepository.findByCity(city);
    }
}
