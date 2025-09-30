package com.wecp.financial_seminar_and_workshop_management.entity;

<<<<<<< HEAD

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


public class Resource {
    // implement the Resource entity here
}
=======
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
@Table(name = "resources")
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String description;
    private String availabilityStatus;

    @ManyToOne
    @JoinColumn(name = "event_id")
    @JsonIgnore
    private Event event;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getAvailabilityStatus() { return availabilityStatus; }
    public void setAvailabilityStatus(String availabilityStatus) { this.availabilityStatus = availabilityStatus; }

    public Event getEvent() { return event; }
    public void setEvent(Event event) { this.event = event; }
}
>>>>>>> 0d221b740ff89a243050c3e642c540fb911f0c6e
