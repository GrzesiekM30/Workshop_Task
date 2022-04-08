package sda.javaadvanced.basic.carReapirShop;

import java.util.ArrayList;
import java.util.List;

import static sda.javaadvanced.basic.carReapirShop.Colors.ANSI_RED;


public interface CreatingListsOfCarsAndServicesForEachClient {

    static List createCarList(Object o){
        System.out.println("Client car list created");
        List<Object> objects = new ArrayList<>();
        objects.add(o);
        return objects;
    }
    static List createServiceList(Object o){
        System.out.println("Client service list created");
        List<Object> objects = new ArrayList<>();
        objects.add(o);
        return objects;
    }
}
