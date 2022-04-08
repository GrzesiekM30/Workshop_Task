package sda.javaadvanced.basic.carReapirShop;

import java.util.List;
import java.util.stream.Collectors;

public class repairShopMain implements AddingServicesAndCarsForClients, CreatingListsOfCarsAndServicesForEachClient, ListOfClientsAndServicesForWorkshop {
    public static void main(String[] args) {
        ClientCar kowalskiFirstCar = new ClientCar("Ford",1.5,1999);
        ClientCar kowalskiSecondtCar = new ClientCar("Skoda",1.6,1998);

        List <ClientCar> listOfKowalskiCars = CreatingListsOfCarsAndServicesForEachClient.createCarList(kowalskiFirstCar);

        ServicePerformed service1ForKowalski = new ServicePerformed(55, ServiceList.BATTERY_REPLACENT);

        List<ServicePerformed> listOfServicesForKowalski = CreatingListsOfCarsAndServicesForEachClient.createServiceList(service1ForKowalski);

        Client kowalskiJan = new Client("Jan","Kowalski",listOfKowalskiCars,listOfServicesForKowalski);

        ServicePerformed service2ForKowalski = new ServicePerformed(60, ServiceList.BREAK_DISC_REPLACMENT);

        AddingServicesAndCarsForClients.addingCar(kowalskiJan,kowalskiSecondtCar);
        AddingServicesAndCarsForClients.addingService(kowalskiJan, service2ForKowalski);

        List<Client> listOfClients = ListOfClientsAndServicesForWorkshop.createClientList(kowalskiJan);
        List<ServicePerformed> listOfServices = ListOfClientsAndServicesForWorkshop.createServiceList(service1ForKowalski);


        ClientCar nowakFirstCar = new ClientCar("Fiat",1.0,1999);

        List <ClientCar> listOfNowakCars = CreatingListsOfCarsAndServicesForEachClient.createCarList(nowakFirstCar);

        ServicePerformed service1ForNowak = new ServicePerformed(59, ServiceList.BREAK_DISC_REPLACMENT);
        ServicePerformed service2ForNowak = new ServicePerformed(54, ServiceList.ENGINE_CHECK);

        List<ServicePerformed> listOfServicesForNowak = CreatingListsOfCarsAndServicesForEachClient.createServiceList(service1ForNowak);

        Client nowakJurek = new Client("Jurek","Nowak",listOfNowakCars,listOfServicesForNowak);
        ListOfClientsAndServicesForWorkshop.addingClient(listOfClients, nowakJurek);
        AddingServicesAndCarsForClients.addingService(nowakJurek,service2ForNowak);
        ListOfClientsAndServicesForWorkshop.addingService(listOfServices,service2ForKowalski);
        ListOfClientsAndServicesForWorkshop.addingService(listOfServices,service1ForNowak);
        ListOfClientsAndServicesForWorkshop.addingService(listOfServices,service2ForNowak);

        customersRecors(listOfClients);

        serviceRecors(listOfServices);

        specificServiceRecord(listOfServices, ServiceList.BREAK_DISC_REPLACMENT);

        specificServiceRecord(listOfServices, ServiceList.OIL_CHANGE);

        specificServiceRecord(listOfServices, ServiceList.ENGINE_CHECK);

        System.out.println(clientRecords(kowalskiJan));

        System.out.println(clientRecords(nowakJurek));

        System.out.println(clientExpenses(kowalskiJan));


    }

    private static void customersRecors(List<Client>clients){
        System.out.println("Customer records:");
        clients.stream()
                .forEach(System.out::println);
    }
    private static void serviceRecors(List<ServicePerformed>servicePerformeds){
        System.out.println("Service records:");
        servicePerformeds.stream()
                .forEach(System.out::println);
    }
    private static void specificServiceRecord(List<ServicePerformed> servicePerformedList, ServiceList service ){
        System.out.println("Specyfic records");
        int size = servicePerformedList.stream()
                .filter(servicePerformed -> service.equals(servicePerformed.getService()))
                .collect(Collectors.toList())
                .size();
        double price = servicePerformedList.stream()
                .filter(servicePerformed -> service.equals(servicePerformed.getService()))
                .map(servicePerformed-> servicePerformed.getPrice())
                .reduce(0.0,(price1, price2)-> price1 + price2);
        String finalPrice;
        if (size == 0){
            finalPrice = new StringBuilder("Service: ").append(service.getPlName())
                    .append("\nService has not yet been performed")
                    .toString();
            } else if(size==1){
             finalPrice = new StringBuilder("Service: ").append(service.getPlName())
                    .append("\nDone ").append(size).append(" time,")
                    .append("\nMoney earned: ").append(price)
                    .toString();

            }else {
             finalPrice = new StringBuilder("Service: ").append(service.getPlName())
                    .append("\nDone ").append(size).append(" times,")
                    .append("\nMoney earned: ").append(price)
                    .toString();
            }

        System.out.println(finalPrice);

        }
    private static String clientRecords(Client client){
        int howManyCars = client.getCarsList().size();
        String name = client.getName();
        String surname = client.getSurname();
        String howManyCarsClientServiced;
        if(howManyCars==1){
            howManyCarsClientServiced = new StringBuilder("Client:\n").append(name).append(" ").append(surname)
                    .append("\n").append(howManyCars).append(" car has been serviced.").toString();
        }else {
            howManyCarsClientServiced = new StringBuilder("Client:\n").append(name).append(" ").append(surname)
                    .append("\n").append(howManyCars).append(" cars were serviced.").toString();
        }
        return howManyCarsClientServiced;
    }

    private static String clientExpenses(Client client){
        double expenses = client.getServiceList().stream()
                .map(servicePerformed -> servicePerformed.getPrice())
                .reduce(0.0,(price1, price2)-> price1 + price2);

        String name = client.getName();
        String surname = client.getSurname();
        return new StringBuilder("Client ").append(name).append(" ").append(surname)
                .append(" spend ").append(expenses).append(" $ at the repair shop.").toString();

    }

}
