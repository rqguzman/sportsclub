package com.rqguzman.sportsclub.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SportTests {

    @Test
    public void sport_Should_Have_CorrectStructure() {

        Sport entity = new Sport();
        entity.setId(1L);
        entity.setDescription("jiujitsu");

        Assertions.assertNotNull(entity.getId());
        Assertions.assertNotNull(entity.getDescription());
    }
}
