package sda.javaadvanced.basic.carReapirShop;

import java.util.ArrayList;
import java.util.List;

import static sda.javaadvanced.basic.carReapirShop.Colors.ANSI_BLUE;
import static sda.javaadvanced.basic.carReapirShop.Colors.ANSI_GREEN;

public interface ListOfClientsAndServicesForWorkshop {

    static List createClientList(Object o){
        System.out.println("Client list created");
        List<Object> objects = new ArrayList<>();
        objects.add(o);
        return objects;
    }
    static List createServiceList(Object o){
        System.out.println("Services list created");
        List<Object> objects = new ArrayList<>();
        objects.add(o);
        return objects;
    }
    static void addingService(List<ServicePerformed> o, ServicePerformed servicePerformed){
        o.add(servicePerformed);
        System.out.println("Service added to Service List");
    }
    static void addingClient(List<Client> o, Client client){
        o.add(client);
        System.out.println("Client added to Client List");
    }


}
