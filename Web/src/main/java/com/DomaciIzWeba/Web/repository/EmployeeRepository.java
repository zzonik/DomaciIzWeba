package com.DomaciIzWeba.Web.repository;

import com.DomaciIzWeba.Web.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findAllByPositionOrderByFirstName(String position);

    List<Employee> findByFirstNameOrLastName(String firstName, String lastName);

    List<Employee> findByFirstNameIgnoreCase(String firstName);

    List<Employee> findByDepartmentName(String departmentName);

}
