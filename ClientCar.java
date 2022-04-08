package sda.javaadvanced.basic.carReapirShop;

public class ClientCar  {
    private String nameOfCar;
    private double engine;
    private int productionDate;

    public ClientCar(String nameOfCar, double engine, int productionDate) {
        this.nameOfCar = nameOfCar;
        this.engine = engine;
        this.productionDate = productionDate;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public double getEngine() {
        return engine;
    }

    public int getProductionDate() {
        return productionDate;
    }

    @Override
    public String toString() {
        return nameOfCar
                ;
    }
}
