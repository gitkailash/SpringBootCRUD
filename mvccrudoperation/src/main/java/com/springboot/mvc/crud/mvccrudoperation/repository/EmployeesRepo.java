package com.springboot.mvc.crud.mvccrudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.mvc.crud.mvccrudoperation.model.Employees;

@Repository
public interface EmployeesRepo extends JpaRepository<Employees, Long> {

}
