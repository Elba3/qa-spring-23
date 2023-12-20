package Pages;

public class ReservationInfo {
    private String firstName;
    private String lastName;
    private String discount;
    private String passengerCount;
    private String childCount;
    private String bagsCount;
    private String flightDate;

    public ReservationInfo(String firstName, String lastName, String discount, String passengerCount, String childCount, String bagsCount, String flightDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.discount = discount;
        this.passengerCount = passengerCount;
        this.childCount = childCount;
        this.bagsCount = bagsCount;
        this.flightDate = flightDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(String passengerCount) {
        this.passengerCount = passengerCount;
    }

    public String getChildCount() {
        return childCount;
    }

    public void setChildCount(String childCount) {
        this.childCount = childCount;
    }

    public String getBagsCount() {
        return bagsCount;
    }

    public void setBagsCount(String bagsCount) {
        this.bagsCount = bagsCount;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }
}
