public class Ship {
    private String shipName;
    private String shipYear;

    // default
    public Ship() {
        this.shipName = "S.S. Generic";
        this.shipYear = "2000";
    }

    // parameterized
    public Ship(String shipName, String shipYear) {
        this.shipName = shipName;
        this.shipYear = shipYear;
    }

    // getters
    public String getShipName() {
        return shipName;
    }

    public String getShipYear() {
        return shipYear;
    }

    // setters
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setShipYear(String shipYear) {
        this.shipYear = shipYear;
    }

    @Override 
    public String toString() {
        return "Name of ship: " + shipName + " | Year it was built: " + shipYear;
    }
}