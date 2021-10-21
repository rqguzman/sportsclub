package com.rqguzman.sportsclub.dto;

import com.rqguzman.sportsclub.entities.Contact;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class ContactDTO implements Serializable {

    private static final long serialVersionUID = -5442847359448392797L;

    private Long id;

    @Email(message = "please inform a valid email address")
    @NotBlank(message = "this field is required")
    private String email;

    @NotBlank(message = "this field is required")
    private String phone;

    @NotBlank(message = "this field is required")
    private String address;
    private Long clientId;

    public ContactDTO() {
    }

    public ContactDTO(Long id, String email, String phone, String address, Long clientId) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.clientId = clientId;
    }

    public ContactDTO(Contact entity) {
        id = entity.getId();
        email = entity.getEmail();
        phone = entity.getPhone();
        address = entity.getAddress();
        clientId = entity.getClient().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
}
