public class CruiseShip extends Ship {
    private int maxPassengers;

    // default
    public CruiseShip() {
        super();
        setMaxPassengers(0);;
    }

    // parameterized
    public CruiseShip(String shipName, String shipYear, int maxPassengers) {
        super(shipName, shipYear);
        setMaxPassengers(maxPassengers);
    }

    // getters
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        if (maxPassengers < 0) {
            throw new IllegalArgumentException("Maximum number of passengers must be positive");
        }
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString() {
        return "Name of ship: " + getShipName() + " | Max number of passengers: " + maxPassengers;
    }
}