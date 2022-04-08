package sda.javaadvanced.basic.carReapirShop;

import static sda.javaadvanced.basic.carReapirShop.Colors.ANSI_CYAN;

public interface AddingServicesAndCarsForClients {

  static void addingCar(Client client, ClientCar car){
        client.getCarsList().add(car);
        System.out.println("Car added for " + client.getName() + " " + client.getSurname());
    }
  static void addingService(Client client, ServicePerformed servicePerformed){
        client.getServiceList().add(servicePerformed);
        System.out.println("Service added for " + client.getName() + " " + client.getSurname());
    }

}
