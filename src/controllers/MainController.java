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
        this.showProp();
    }

    private void showProp() {
        RestApi restApi = new RestApi();
        String rest = restApi.getProperties();
        ArrayList<Property> propList = convertStringToArray(rest);
        this.mainConsole.showProperties(propList);
    }

    private ArrayList<Property> convertStringToArray(String text) {
        ArrayList<Property> propList = null;
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Property[] propArray = gson.fromJson(text, Property[].class);
        propList = new ArrayList<>(Arrays.asList(propArray));
        return propList;
    }
}
