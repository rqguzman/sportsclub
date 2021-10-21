package com.rqguzman.sportsclub.controllers;

import com.rqguzman.sportsclub.dto.SportDTO;
import com.rqguzman.sportsclub.entities.Sport;
import com.rqguzman.sportsclub.services.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sports")
public class SportController {

    @Autowired
    private SportService service;

    @GetMapping
    public ResponseEntity<List<SportDTO>> findAll() {

        List<SportDTO> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<SportDTO> findById(@PathVariable Long id) {
        SportDTO dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }

}
