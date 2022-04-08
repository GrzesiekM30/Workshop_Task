package sda.javaadvanced.basic.carReapirShop;

public enum ServiceList {

    OIL_CHANGE("Wymiana oleju"),
    REPLACMENT_OF_BREAK_PADS("Wymiana klocków hamólcowych"),
    BREAK_DISC_REPLACMENT("Wymian tarcz hamólcowych"),
    ENGINE_CHECK("Sprawdzenie silnika"),
    BATTERY_REPLACENT("Wymiana akumulatora");


    private String plName;

    ServiceList( String plName) {

        this.plName = plName;
    }


    public String getPlName() {
        return plName;
    }
}
