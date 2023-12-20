package model;

public class Sofa {
    //-----------------ATTRIBUTES------------------
    private double height;
    private double width;
    private double length;
    private String material;
    private String color;
    private String type;
    private int seatsCount;

    //---------------------GETTERS/SETTERS---------------------------

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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public void setSeatsCount(int seatsCount) {
        this.seatsCount = seatsCount;
    }
    //----------------CUSTOM METHODS----------------
    public void printTypeAndSeatCount() {
        System.out.println(type + " " + seatsCount );
    }
}
