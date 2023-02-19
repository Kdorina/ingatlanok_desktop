package views;
import java.util.ArrayList;
import models.Property;

public class MainConsole{


    public MainConsole(){
        
    }

    public void showProperties(ArrayList<Property> props){
        for(Property prop : props){
            System.out.printf(
                prop.getCity(),
                prop.getAddress(),
                prop.getSize(),
                prop.getPrice());
        }
    }
}