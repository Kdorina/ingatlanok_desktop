/*
* File: MainConsole.java
* Author: Kovács Dorina
* Copyright: 2023, Kovács Dorina
* Group: Szoft II/N
* Date: 2023-02-19
* Github: https://github.com/Kdorina/
* Licenc: GNU GPL
*/

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