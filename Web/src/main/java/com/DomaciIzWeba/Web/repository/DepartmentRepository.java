package com.DomaciIzWeba.Web.repository;

import com.DomaciIzWeba.Web.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
