package views;
import java.util.ArrayList;
import models.Property;

public class MainConsole{

    public void showProperties(ArrayList<Property> props){
        for(Property prop : props){
            System.out.printf(
                "|%17s |%17s |%10s |%10s |\n",
                prop.getCity(),
                prop.getAddress(),
                prop.getSize(),
                prop.getPrice()
                );
          }
     }
}