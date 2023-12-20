package model;

public class WashingMachine {
    //-----------ATTRIBUTES-------------------------
    private String model;
    private double height;
    private double width;
    private double weight;
    private String color;
    private boolean dryingFunction;
    private int programCount;

    //-------------------GETTERS/SETTERS----------------------

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDryingFunction() {
        return dryingFunction;
    }

    public void setDryingFunction(boolean dryingFunction) {
        this.dryingFunction = dryingFunction;
    }

    public int getProgramCount() {
        return programCount;
    }

    public void setProgramCount(int programCount) {
        this.programCount = programCount;
    }

    //-----------------CUSTOM METHODS----------------------------
    public void printParameters() {
        System.out.println(height+ "/" + width + "/" + height);
        
    }
}

