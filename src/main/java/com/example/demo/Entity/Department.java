package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class Department {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)

  private int department_id;

  private String department_name;

  private String department_location;

  @OneToMany(mappedBy = "department",fetch = FetchType.LAZY)
  @JsonIgnore
  private List<Employee> employees;

}
