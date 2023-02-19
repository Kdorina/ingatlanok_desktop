/*
* File: Property.java
* Author: Kovács Dorina
* Copyright: 2023, Kovács Dorina
* Group: Szoft II/N
* Date: 2023-02-19
* Github: https://github.com/Kdorina/
* Licenc: GNU GPL
*/


package models;

public class Property {
    String city;
    String address;
    int size;
    int price;


    public Property(String city, String address, int size, int price){
        this.city = city;
        this.address = address;
        this.size = size;
        this.price = price;

    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}