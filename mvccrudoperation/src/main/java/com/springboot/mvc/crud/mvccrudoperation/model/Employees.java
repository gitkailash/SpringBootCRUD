package com.springboot.mvc.crud.mvccrudoperation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employeeId")
    private long employeeId;

    @NotBlank(message = "First Name Can Not Be Blank")
    @NotNull(message = "First Name Can Not Be Null")
    @Column(name = "firstName")
    private String firstName;

    @NotBlank(message = "Last Name Can Not Be Blank")
    @NotNull(message = "First Name Can Not Be Null")
    @Column(name = "lastName")
    private String lastName;

    @Pattern(regexp = "^\\d{10}$", message = "Invalid Mobile Number")
    private String mobile;

    @Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
    private String email;

    private String gender;

}
