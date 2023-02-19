/*
* File: MainController.java
* Author: Kovács Dorina
* Copyright: 2023, Kovács Dorina
* Group: Szoft II/N
* Date: 2023-02-19
* Github: https://github.com/Kdorina/
* Licenc: GNU GPL
*/
package controllers;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import models.Property;
import models.RestApi;
import views.MainConsole;

public class MainController {
    MainConsole mainConsole;

    public MainController() {
        this.mainConsole = new MainConsole();
        this.showPropertie();
    }

    private void showPropertie() {
        RestApi restApi = new RestApi();
        String rest = restApi.getProperties();
        ArrayList<Property> propertieList = convertStringToArray(rest);
        this.mainConsole.showProperties(propertieList);
    }

    private ArrayList<Property> convertStringToArray(String text) {
        ArrayList<Property> propertieList = null;
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Property[] propertieArray = gson.fromJson(text, Property[].class);
        propertieList = new ArrayList<>(Arrays.asList(propertieArray));
        return propertieList;
    }
}
