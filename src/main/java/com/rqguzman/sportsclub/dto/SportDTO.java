package com.rqguzman.sportsclub.dto;

import com.rqguzman.sportsclub.entities.Sport;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class SportDTO implements Serializable {

    private static final long serialVersionUID = -8727734186561087408L;

    private Long id;

    @NotBlank(message = "this field is required")
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
