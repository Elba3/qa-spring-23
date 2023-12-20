package model;

public class Chair {
    //--------------------ATTRIBUTES------------------------
    private double height;
    private double width;
    private double length;
    private String material;
    private String color;

    //--------------GETTERS/SETTERS-------------------------

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

        //------------------------CUSTOM METHODS--------------
    public void printMaterialColor(){System.out.println(material + " " + color); }



}
