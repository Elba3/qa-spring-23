package model;

public class Family {
    //--------------------ATTRIBUTES---------------------------------
    private int membersNumber;
    private int ChildrenCount;
    private boolean pet;
    private String houseAddress;
    private String familyLastNme;

    //----------------GETTERS/SETTERS------------------------


    public int getMembersNumber() {
        return membersNumber;
    }

    public void setMembersNumber(int membersNumber) {
        this.membersNumber = membersNumber;
    }

    public int getChildrenCount() {
        return ChildrenCount;
    }

    public void setChildrenCount(int childrenCount) {
        ChildrenCount = childrenCount;
    }

    public boolean isPet() {
        return pet;
    }

    public void setPet(boolean pet) {
        this.pet = pet;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getFamilyLastNme() {
        return familyLastNme;
    }

    public void setFamilyLastNme(String familyLastNme) {
        this.familyLastNme = familyLastNme;
    }

    //----------------CUSTOM METHODS------------------
    public void printLastnameAdress() {System.out.println(familyLastNme + " " + houseAddress);
    }
}
