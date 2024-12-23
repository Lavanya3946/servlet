package com.xworkz.milk.dto;

public class MuseumTicketFormDto {
    private String customerName;
    private int totalAdultMembers;
    private int totalChildMembers;
    private String mobileNo;
    private String email;

    public MuseumTicketFormDto(String customerName, int totalAdultMembers, int totalChildMembers, String mobileNo, String email) {
        this.customerName = customerName;
        this.totalAdultMembers = totalAdultMembers;
        this.totalChildMembers = totalChildMembers;
        this.mobileNo = mobileNo;
        this.email = email;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getTotalAdultMembers() {
        return totalAdultMembers;
    }

    public void setTotalAdultMembers(int totalAdultMembers) {
        this.totalAdultMembers = totalAdultMembers;
    }

    public int getTotalChildMembers() {
        return totalChildMembers;
    }

    public void setTotalChildMembers(int totalChildMembers) {
        this.totalChildMembers = totalChildMembers;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
