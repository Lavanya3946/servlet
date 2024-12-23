
package com.xworkz.milk.dto;

public class CricketTournamentFormDto {
    private String tournamentName;
    private String organizerName;
    private String location;
    private String startDate;
    private String endDate;
    private int totalTeams;
    private String contactNumber;
    private String email;

    public CricketTournamentFormDto(String tournamentName, String organizerName, String location, String startDate, String endDate, int totalTeams, String contactNumber, String email) {
        this.tournamentName = tournamentName;
        this.organizerName = organizerName;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalTeams = totalTeams;
        this.contactNumber = contactNumber;
        this.email = email;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getTotalTeams() {
        return totalTeams;
    }

    public void setTotalTeams(int totalTeams) {
        this.totalTeams = totalTeams;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
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
