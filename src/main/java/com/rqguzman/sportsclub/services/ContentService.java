package com.rqguzman.sportsclub.services;

import com.rqguzman.sportsclub.dto.ContactDTO;
import com.rqguzman.sportsclub.entities.Contact;
import com.rqguzman.sportsclub.repositories.ContactRepository;
import com.rqguzman.sportsclub.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContentService {

    @Autowired
    private ContactRepository repository;

    public ContactDTO findContactByClientId(Long id) {

        Optional<Contact> obj = repository.findContactByClientId(id);

        Contact entity = obj.orElseThrow(() -> new ResourceNotFoundException("Contact not found!"));

        return new ContactDTO(entity);
    }
}
