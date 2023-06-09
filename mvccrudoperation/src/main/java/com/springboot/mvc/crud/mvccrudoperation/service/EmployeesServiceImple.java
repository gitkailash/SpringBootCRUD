package com.springboot.mvc.crud.mvccrudoperation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mvc.crud.mvccrudoperation.model.Employees;
import com.springboot.mvc.crud.mvccrudoperation.repository.EmployeesRepo;

@Service
public class EmployeesServiceImple implements EmployeesService {

    @Autowired
    private EmployeesRepo employeesRepo;

    @Override
    public List<Employees> getAllEmployees() {
        // Fetching All Employees
        return employeesRepo.findAll();

    }

    @Override
    public Employees addEmployees(Employees employees) {
        // Adding All Employees
        employeesRepo.save(employees);
        return employees;
    }

    @Override
    public Optional<Employees> getSingleEmployee(Long employeeId) {
        // Getting single Employee
        return employeesRepo.findById(employeeId);

    }

    @Override
    public void updateEmployees(Employees employee, Long employeeId) {
        // Updating the employee
        employeesRepo.save(employee);
    }

    @Override
    public void deletEmployees(Long employeeId) {
        // Deleting the Employee
        employeesRepo.deleteById(employeeId);
    }

}
