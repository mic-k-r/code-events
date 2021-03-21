package org.launchcode.codeevents.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.*;

@Entity
public class EventDetails extends AbstractEntity {

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
    private boolean registrationRequired = true;

    public EventDetails(String description,
                        String contactEmail,
                        String location,
                        int numAttendees,
                        boolean registrationRequired) {
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.numAttendees = numAttendees;
        this.registrationRequired = registrationRequired;
    }

    public EventDetails() {
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

    public boolean isRegistrationRequired() {
        return registrationRequired;
    }

    public void setRegistrationRequired(boolean registrationRequired) {
        this.registrationRequired = registrationRequired;
    }
}
