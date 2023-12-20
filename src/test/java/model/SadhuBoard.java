package model;

public class SadhuBoard {
    //------------------ATTRIBUTES----------------------------
    private String material;
    private boolean nails;
    private  double nailHeight;
    private double nailCount;
    private String nailMaterial;
    private int halvesCount;
    private String purpose;

    //---------------------GETTERS/SETTERS------------------


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isNails() {
        return nails;
    }

    public void setNails(boolean nails) {
        this.nails = nails;
    }

    public double getNailHeight() {
        return nailHeight;
    }

    public void setNailHeight(double nailHeight) {
        this.nailHeight = nailHeight;
    }

    public double getNailCount() {
        return nailCount;
    }

    public void setNailCount(double nailCount) {
        this.nailCount = nailCount;
    }

    public String getNailMaterial() {
        return nailMaterial;
    }

    public void setNailMaterial(String nailMaterial) {
        this.nailMaterial = nailMaterial;
    }

    public int getHalvesCount() {
        return halvesCount;
    }

    public void setHalvesCount(int halvesCount) {
        this.halvesCount = halvesCount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    //----------------CUSTOM METHODS-------------------
     public void printMaterialNailHeight() {System.out.println(material + " " + nailHeight);
     }
}
