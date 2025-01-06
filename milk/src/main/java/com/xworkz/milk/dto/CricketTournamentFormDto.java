
package com.xworkz.milk.dto;

import lombok.*;

import java.time.LocalDate;
 @NoArgsConstructor
 @AllArgsConstructor
 @Getter
 @Setter
 @ToString
public class CricketTournamentFormDto {
    private  int id;
    private String tournamentName;
    private String organizerName;
    private String location;
    private String startDate;
    private String endDate;
    private int totalTeams;
    private long contactNumber;
    private String email;

 }
