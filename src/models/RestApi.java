/*
* File: RestApi.java
* Author: Kovács Dorina
* Copyright: 2023, Kovács Dorina
* Group: Szoft II/N
* Date: 2023-02-19
* Github: https://github.com/Kdorina/
* Licenc: GNU GPL
*/

package models;

public class RestApi {

    public RestApi(){

    }

    public String getProperties(){

        HttpClient http = new HttpClient();
        String host = "http://[::1]:3000/";
        String endpoint = "properties";
        String urlStr = host + endpoint;
        String rest = http.get(urlStr);
        return rest;
    }
}
