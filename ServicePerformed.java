package sda.javaadvanced.basic.carReapirShop;

public class ServicePerformed {
    private double price;
    private ServiceList service;

    public ServicePerformed(double price, ServiceList service) {
        this.price = price;
        this.service = service;
    }

    public double getPrice() {
        return price;
    }

    public ServiceList getService() {
        return service;
    }

    @Override
    public String toString() {
        return "Service Performed{" +
                "Service = " + service.getPlName() +
                 " at price = " + price +
        '}';
    }
}
