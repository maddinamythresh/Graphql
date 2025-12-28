package com.example.demo.Controller;


import com.example.demo.DTO.UpdateEmployee;
import com.example.demo.Entity.Employee;
import com.example.demo.Service.graphqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class graphqlController {


  @Autowired
  private graphqlService graphsevice;

  @QueryMapping
  public List<Employee> employees(){
    return graphsevice.employees();
  }

  @MutationMapping

  public Employee addEmployee(@Argument("input") UpdateEmployee emp){

    return  graphsevice.addEmployee(emp);
  }

  // updateEmployee
  @MutationMapping
  public Employee updateEmployee(@Argument("input") UpdateEmployee emp){

    return graphsevice.UpdateEmployee(emp);
  }

}
