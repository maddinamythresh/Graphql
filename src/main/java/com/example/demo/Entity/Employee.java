package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Employee {

  @Id
  private Long id;
  private String name;
  private String email;
  private String role;
  private  double salary;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="department_id")
  private  Department department;

}
