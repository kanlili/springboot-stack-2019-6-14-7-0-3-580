package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employees;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by jxzhong on 18/08/2017.
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final Logger log = Logger.getLogger(this.getClass().getName());

    @GetMapping
    public List<Employees> getEmployees() {

        return Employees.createEmployees();
    }
    @PostMapping
    public  List<Employees>  printEmployee(@RequestBody Employees employees){
        List<Employees>employee=Employees.createEmployees();
        employee.add(employees);
        return employee;
    }
//    @PutMapping
//    public List<Employees> queryEmployees(@RequestBody int id){
//
//        return  Employees.createEmployees(employees1);
//    }
}
