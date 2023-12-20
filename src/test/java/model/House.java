package model;

public class House {
    //---------------------ATTRIBUTES------------------
    private String adress;
    private int entranceCount;
    private int floorCount;
    private int apartmentCount;
    private boolean elevator;
    private boolean intercoms;

    //-----------------GETTERS/SETTERS----------------------


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getEntranceCount() {
        return entranceCount;
    }

    public void setEntranceCount(int entranceCount) {
        this.entranceCount = entranceCount;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public int getApartmentCount() {
        return apartmentCount;
    }

    public void setApartmentCount(int apartmentCount) {
        this.apartmentCount = apartmentCount;
    }

    public boolean isElevator() {
        return elevator;
    }

    public void setElevator(boolean elevator) {
        this.elevator = elevator;
    }

    public boolean isIntercoms() {
        return intercoms;
    }

    public void setIntercoms(boolean intercoms) {
        this.intercoms = intercoms;
    }

    //----------------CUSTOM METHODS-----------------
    public void printAddressFloorCount() {System.out.println(adress + " " + floorCount);
    }
}
