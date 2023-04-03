package com.DomaciIzWeba.Web.repository;

import com.DomaciIzWeba.Web.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
