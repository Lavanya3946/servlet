package com.xworkz.milk.dto;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class MuseumTicketFormDto {
    private  int id;
    private String customerName;
    private int totalAdultMembers;
    private int totalChildMembers;
    private long mobileNo;
    private String email;

    public MuseumTicketFormDto(String customerName, int totalAdultMembers, int totalChildMembers, long mobileNo, String email) {
        this.customerName = customerName;
        this.totalAdultMembers = totalAdultMembers;
        this.totalChildMembers = totalChildMembers;
        this.mobileNo = mobileNo;
        this.email = email;
    }
}
