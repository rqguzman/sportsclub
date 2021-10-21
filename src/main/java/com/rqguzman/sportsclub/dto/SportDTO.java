package com.rqguzman.sportsclub.dto;

import com.rqguzman.sportsclub.entities.Sport;

public class SportDTO {

    private Long id;

    private String description;

    public SportDTO() {
    }

    public SportDTO(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public SportDTO(Sport entity) {
        id = entity.getId();
        description = entity.getDescription();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
