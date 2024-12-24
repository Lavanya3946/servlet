
package com.xworkz.milk.dto;

import java.time.LocalDate;

public class CricketTournamentFormDto {
    private String tournamentName;
    private String organizerName;
    private String location;
    private LocalDate startDate;
    private LocalDate endDate;
    private int totalTeams;
    private long contactNumber;
    private String email;

    public CricketTournamentFormDto(String tournamentName, String organizerName, String location, LocalDate startDate, LocalDate endDate, int totalTeams, String contactNumber, String email) {
        this.tournamentName = tournamentName;
        this.organizerName = organizerName;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalTeams = totalTeams;
        this.contactNumber = Long.parseLong(contactNumber);
        this.email = String.valueOf(email);
    }


    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getTotalTeams() {
        return totalTeams;
    }

    public void setTotalTeams(int totalTeams) {
        this.totalTeams = totalTeams;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CricketTournamentFormDto{" +
                "tournamentName='" + tournamentName + '\'' +
                ", organizerName='" + organizerName + '\'' +
                ", location='" + location + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", totalTeams=" + totalTeams +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
