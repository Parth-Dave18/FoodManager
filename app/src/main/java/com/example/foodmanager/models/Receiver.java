package com.example.foodmanager.models;

public class Receiver implements listuser {
    final int ORGANIZATION = 1;
    final int SMALL_GROUP = 2;
    final int INDIVIDUAL = 3;

    int type;



    String PhoneNo;
    String name;
    int noOfPeople;
    String address;
    String city;

    @Override
    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Receiver(int type, String name, int noOfPeople, String address, String city) {
        this.type = type;
        this.name = name;
        this.noOfPeople = noOfPeople;
        this.address = address;
        this.city = city;
    }
    public Receiver(String name, int noOfPeople, String address, String city) {
        this.name = name;
        this.noOfPeople = noOfPeople;
        this.address = address;
        this.city = city;
    }

    public Receiver(){}

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfPeople() {
        return noOfPeople;
    }

    public void setNoOfPeople(int noOfPeople) {
        this.noOfPeople = noOfPeople;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void display() {
        return;
    }
}
