package com.rqguzman.sportsclub.repositories;

import com.rqguzman.sportsclub.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    Optional<Contact> findContactByClientId(Long id);

}
