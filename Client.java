package sda.javaadvanced.basic.carReapirShop;

import sda.javaadvanced.basic.exercise.Human;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String surname;
    private List<ClientCar> carsList = new ArrayList<>();
    private List<ServicePerformed> serviceList = new ArrayList<>();


    public Client(String name, String surname, List<ClientCar> carsList, List<ServicePerformed> serviceList) {
        this.name = name;
        this.surname = surname;
        this.carsList = carsList;
        this.serviceList = serviceList;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<ClientCar> getCarsList() {
        return carsList;
    }

    public List<ServicePerformed> getServiceList() {
        return serviceList;
    }

    @Override
    public String toString() {
        String cars = carsList.toString();
        return  new StringBuilder("Client ")
                .append("name= " ).append(name)
                .append(", surname= " ).append(surname)
                .append(", cars=").append(cars).toString();


    }
}
