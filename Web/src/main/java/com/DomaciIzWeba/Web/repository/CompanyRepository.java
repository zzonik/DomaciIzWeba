package com.DomaciIzWeba.Web.repository;

import com.DomaciIzWeba.Web.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
