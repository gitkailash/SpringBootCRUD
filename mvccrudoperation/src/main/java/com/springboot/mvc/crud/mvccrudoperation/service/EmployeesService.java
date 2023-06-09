package com.springboot.mvc.crud.mvccrudoperation.service;

import java.util.List;
import java.util.Optional;

import com.springboot.mvc.crud.mvccrudoperation.model.Employees;

public interface EmployeesService {

    public List<Employees> getAllEmployees();

    public Employees addEmployees(Employees employees);

    public Optional<Employees> getSingleEmployee(Long employeeId);

    public void updateEmployees(Employees employee, Long employeeId);

    public void deletEmployees(Long employeeId);

}
