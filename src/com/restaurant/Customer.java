package com.restaurant;

public class Customer {
    private String name;
    private String address;
    private long phonenumber;
    private String city;
    private String state;
    private String emailId;

    //Getter
    // to get the value of variable
    public String getName(){

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;

    }

    public void setAddress(String address) {
        this.address = address;

    }

    public long getPhonenumber() {
        return phonenumber;

    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;

    }

    public String getCity() {
        return city;

    }

    public void setCity(String city) {
        this.city = city;

    }

    public String getState() {
        return state;

    }

    public void setState(String state) {
        this.state = state;

    }

    public String getEmailId() {
        return emailId;

    }

    public void setEmailId(String emaidId) {
        this.emailId = emaidId;

    }

}
