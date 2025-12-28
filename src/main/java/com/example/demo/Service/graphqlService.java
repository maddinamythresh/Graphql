package com.example.demo.Service;


import com.example.demo.DTO.UpdateEmployee;
import com.example.demo.Entity.Employee;
import com.example.demo.Repository.GraphqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class graphqlService {

  @Autowired
  private GraphqlRepository repository;

  public List<Employee> employees(){


//    repository.findAll().stream().limit(1).forEach(val-> System.out.println(val.getId()));

    return repository.findAll();

  }

  public Employee UpdateEmployee(UpdateEmployee employee){

    Employee emp= employee.id()!=null? repository.findById(employee.id()).orElse(new Employee()):new Employee();

    if(employee.name()!=null) emp.setName(employee.name());
    if(employee.email()!=null) emp.setEmail(employee.email());
    if(employee.role()!=null) emp.setRole(employee.role());
    if(employee.salary()!=null) emp.setSalary(employee.salary());

    repository.save(emp);

    System.out.println("Hello");

    return repository.findById(employee.id()).orElse(null);
  }


  public Employee addEmployee(UpdateEmployee employee){
    Employee emp= repository.findById(employee.id()).orElse(new Employee());
    emp.setRole(employee.role());
    emp.setSalary(employee.salary());
    emp.setEmail(employee.email());
    emp.setId(employee.id());
    emp.setName(employee.name());

    System.out.println(emp.getId());

    repository.save(emp);

    return  repository.findById(employee.id()).orElse(null);

  }

}
