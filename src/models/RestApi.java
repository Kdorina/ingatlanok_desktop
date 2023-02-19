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
