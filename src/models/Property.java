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


    public String getAddress() {
        return address;
    }


    public int getSize() {
        return size;
    }


    public int getPrice() {
        return price;
    }



}