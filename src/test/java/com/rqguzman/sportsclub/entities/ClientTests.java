package com.rqguzman.sportsclub.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;

public class ClientTests {

    @Test
    public void client_Should_Have_CorrectStructure() {

        Client entity = new Client();
        entity.setId(1L);
        entity.setFirstName("Name");
        entity.setLastName("Lastname");
        entity.setDateOfBirth(LocalDate.parse("1973-05-02"));
//        entity.setContact("name@gmail.com", "(21) 1234-5678", "Rua das Laranjeiras, 75");

        Assertions.assertNotNull(entity.getId());
        Assertions.assertNotNull(entity.getFirstName());
        Assertions.assertNotNull(entity.getLastName());
        Assertions.assertNotNull(entity.getDateOfBirth());
//        Assertions.assertNotNull(entity.getContact());
//        Assertions.assertEquals(0, entity.getSports().size());
    }
}
