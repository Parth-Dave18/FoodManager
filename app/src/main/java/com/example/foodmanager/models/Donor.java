package com.example.foodmanager.models;

public class Donor implements listuser{
    String name;
    String PhoneNo;
    int noOfFoodItems;
    int foodQuantity;
    long bestBefore;
    String itemDes;
    String Address;
    String city;

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

    public Donor(String name, int noOfFoodItems, int foodQuantity, long bestBefore, String itemDes, String address) {
        this.name = name;
        this.noOfFoodItems = noOfFoodItems;
        this.foodQuantity = foodQuantity;
        this.bestBefore = bestBefore;
        this.itemDes = itemDes;
        Address = address;
    }

    public Donor(String name, String phoneNo, int foodQuantity, String address) {
        this.name = name;
        PhoneNo = phoneNo;
        this.foodQuantity = foodQuantity;
        Address = address;
    }

    public Donor(){}

    public Donor(String name,String phoneNo, int noOfFoodItems, int foodQuantity, String itemDes, String address,String city) {
        this.name = name;
        this.PhoneNo = phoneNo;
        this.noOfFoodItems = noOfFoodItems;
        this.foodQuantity = foodQuantity;
        this.itemDes = itemDes;
        Address = address;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    @Override
    public void display() {
        return;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfFoodItems() {
        return noOfFoodItems;
    }

    public void setNoOfFoodItems(int noOfFoodItems) {
        this.noOfFoodItems = noOfFoodItems;
    }

    public int getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public long getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(long bestBefore) {
        this.bestBefore = bestBefore;
    }

    public String getItemDes() {
        return itemDes;
    }

    public void setItemDes(String itemDes) {
        this.itemDes = itemDes;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }



}
