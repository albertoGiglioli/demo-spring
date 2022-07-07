package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface EmployeeRepository extends JpaRepository<Employee, Long> {


    //List<Employee> findByRoleAndNameStartWIth(String role, String nameStartWith);

}