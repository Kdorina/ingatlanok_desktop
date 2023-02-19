package models;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class HttpClient {
    int responseCode;
    public HttpClient(){

    }

    public String get(String url) {
        String result;
        try {
            result = tryGet(url);
        } catch (IOException e) {
            String message = "Hiba! GET kérés sikertelen";
            System.err.println(message);
            result = message;
        }
        return result;
    }

    private String tryGet(String url) throws IOException {
        URL urlStr = new URL(url);
        HttpURLConnection http = (HttpURLConnection) urlStr.openConnection();
        http.setRequestMethod("GET");
        http.connect();
        this.responseCode = http.getResponseCode();
        InputStream inputStream = http.getInputStream();
        String text =  convertInputStreamToString(inputStream);  
        return text;
    }

    private String convertInputStreamToString(InputStream inputStream){
        String text;
        try {
            text = this.tryConvertInputStreamToString(inputStream);
        } catch (Exception e) {
            String message = "Hiba! Nem támogatott kód!";
            System.err.println(message);
            text = message;
        }
        return text;
    }
    private String tryConvertInputStreamToString(InputStream inputStream) throws UnsupportedEncodingException{
        StringBuilder stringBuilder = new StringBuilder();
        final Reader reader = new InputStreamReader(inputStream, "UTF-8");
        Scanner scanner = new Scanner(reader);
        while(scanner.hasNextLine()){
            stringBuilder.append(scanner.nextLine());
        }
        scanner.close();
        return stringBuilder.toString();
    }
    
    public int getResponseCode(){
        return responseCode;
    }
}
