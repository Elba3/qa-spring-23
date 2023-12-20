package model;

public class VacuumCleaner {
     //------------------------ATTRIBUTES--------------------------
    private String model;
    public double weight;
    private boolean aguaFilter;
    private boolean dryCleaningBag;
    private int nozzleCount;
    private String color;

    //-------------------GETTERS/SETTERS----------------------------

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isAguaFilter() {
        return aguaFilter;
    }

    public void setAguaFilter(boolean aguaFilter) {
        this.aguaFilter = aguaFilter;
    }

    public boolean isDryCleaningBag() {
        return dryCleaningBag;
    }

    public void setDryCleaningBag(boolean dryCleaningBag) {
        this.dryCleaningBag = dryCleaningBag;
    }

    public int getNozzleCount() {
        return nozzleCount;
    }

    public void setNozzleCount(int nozzleCount) {
        this.nozzleCount = nozzleCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //--------------CUSTOM METHODS--------------
    public void printModelColor() {
        System.out.println(model + "/"+ color);

    }
}
