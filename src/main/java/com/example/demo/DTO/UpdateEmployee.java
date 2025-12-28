package com.example.demo.DTO;


public record  UpdateEmployee(Long id,
                              String name,
                              String email,
                              String role,
                              Double salary) {

}
