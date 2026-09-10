public class CargoShip extends Ship {
    private int cargoTonnage;

    // default
    public CargoShip() {
        super();
        setCargoTonnage(0);
    }

    // parameterized
    public CargoShip(String shipName, String shipYear, int cargoTonnage) {
        super(shipName, shipYear);
        setCargoTonnage(cargoTonnage);
    }

    // getters
    public int getCargoTonnage() {
        return cargoTonnage;
    }

    // setters
    public void setCargoTonnage(int cargoTonnage) {
        if (cargoTonnage < 0) {
            throw new IllegalArgumentException("Cargo Tonnage must be positive");
        }
        this.cargoTonnage = cargoTonnage;
    }

    @Override 
    public String toString() {
        return "Name of ship: " + getShipName() + " | Cargo Capacity (Tonnage): " + cargoTonnage;
    }
}