package models;

public class RestApi {

    public RestApi(){

    }

    public String getProperties(){

        HttpClient http = new HttpClient();
        String host = "http://[::1]:3000/";
        String endpoint = "properties";
        String url = host + endpoint;
        String rest = http.get(url);
        return rest;
    }
}
