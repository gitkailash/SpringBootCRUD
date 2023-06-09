package com.springboot.mvc.crud.mvccrudoperation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.mvc.crud.mvccrudoperation.model.Employees;
import com.springboot.mvc.crud.mvccrudoperation.service.EmployeesService;

@Controller
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeesService employeesService;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("employeeList", employeesService.getAllEmployees());
        return "index";
    }

    @GetMapping("/showEmployeeForm")
    public String showEmployeeForm(Model model) {
        // creating model attribute to binding form data
        Employees employees = new Employees();
        model.addAttribute("employee", employees);
        return "employee";
    }

    @PostMapping("/employees")
    public String saveEmployee(@ModelAttribute("employees") Employees employees) {
        this.employeesService.addEmployees(employees);
        return "redirect:./home";
    }

    @GetMapping("/showEmployeeUpdateForm/{employeeId}")
    public String showEmployeeUpdateForm(@PathVariable String employeeId, Model model) {
        // creating model attribute to binding form data
        Optional<Employees> employees = employeesService.getSingleEmployee(Long.parseLong(employeeId));
        model.addAttribute("employee", employees);
        return "updateEmployee";
    }

    @GetMapping("/deleteEmployee/{employeeId}")
    public String deleteEmployee(@PathVariable String employeeId) {
        this.employeesService.deletEmployees(Long.parseLong(employeeId));
        return "redirect:../home";
    }
}
