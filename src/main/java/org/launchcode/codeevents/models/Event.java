package org.launchcode.codeevents.models;

import javax.validation.constraints.*;
import java.util.Objects;

public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message="Name is required.")
    @Size(min=3, max=50, message="Name must be between 3 and 50 characters.")
    private String name;

    @Size(max=500, message="Description too long.")
    private String description;

    @NotBlank(message="Email is required.")
    @Email(message="Invalid email. Try again.")
    private String contactEmail;

    @NotBlank(message="Location is required.")
    @Size(max= 100, message="Too many characters.")
    private String location;

    @Min(1)
    private int numAttendees;

    @AssertTrue
    private boolean isRegistered = true;

    public Event(String name, String description, String location, int numAttendees, boolean isRegistered, String contactEmail) {
        this();
        this.name = name;
        this.description = description;
        this.location = location;
        this.numAttendees = numAttendees;
        this.isRegistered = isRegistered;
        this.contactEmail = contactEmail;
    }

    public Event() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumAttendees() {
        return numAttendees;
    }

    public void setNumAttendees(int numAttendees) {
        this.numAttendees = numAttendees;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
