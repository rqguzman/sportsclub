package com.rqguzman.sportsclub.controllers;

import com.rqguzman.sportsclub.dto.ContactDTO;
import com.rqguzman.sportsclub.services.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/contacts")
public class ContactController {

    @Autowired
    private ContentService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ContactDTO> findUserContact(@PathVariable Long id) {

        ContactDTO dto = service.findContactByClientId(id);

        return ResponseEntity.ok().body(dto);
    }
}
