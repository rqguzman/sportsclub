package com.rqguzman.sportsclub.entities.pk;

import com.rqguzman.sportsclub.entities.Client;
import com.rqguzman.sportsclub.entities.Sport;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EnrollmentPK implements Serializable {
    private static final long serialVersionUID = -4314605439362225705L;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "sport_id")
    private Sport sport;

    public EnrollmentPK() {
    }

    public EnrollmentPK(Client client, Sport sport) {
        this.client = client;
        this.sport = sport;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnrollmentPK)) return false;
        EnrollmentPK that = (EnrollmentPK) o;
        return getClient().equals(that.getClient()) && getSport().equals(that.getSport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClient(), getSport());
    }
}
