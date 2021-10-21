package com.rqguzman.sportsclub.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_contact")
public class Contact implements Serializable {

    private static final long serialVersionUID = 1675329697014868231L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String phone;
    private String address;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "client_id")
    @MapsId
    private Client client;

    public Contact() {
    }

    public Contact(Long id, String email, String phone, String address, Client client) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.client = client;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return getId().equals(contact.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
