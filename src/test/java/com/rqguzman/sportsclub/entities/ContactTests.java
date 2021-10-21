package com.rqguzman.sportsclub.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTests {

    @Test
    public void contact_Should_Have_CorrectStructure() {

        Contact entity = new Contact();
        entity.setId(1L);
        entity.setEmail("name@gmail.com");
        entity.setPhone("(21) 1234-5678");
        entity.setAddress("Rua das Laranjeiras, 75");

        Assertions.assertNotNull(entity.getId());
        Assertions.assertNotNull(entity.getEmail());
        Assertions.assertNotNull(entity.getPhone());
        Assertions.assertNotNull(entity.getAddress());
    }
}
