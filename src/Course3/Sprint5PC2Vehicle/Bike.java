package Course3.Sprint5PC2Vehicle;

public class Bike extends VehicleManufacturer implements Vehicle {
    public Bike(String vehicleName, String vehicleModelName, String vehicleType) {
        setVehicleName(vehicleName);
        setVehicleModelName(vehicleModelName);
        setVehicleType(vehicleType);
    }

    @Override
    public int maxSpeed(String vehicleType) {
        if (vehicleType.equals("sportsBike")) {
            return 250;
        } else if (vehicleType.equals("cruiser")) {
            return 170;
        } else {
            return 0;
        }
    }

    @Override
    public String getManufacturerInformation() {
        return "Bike (Manufacturer name: '" + getVehicleName() + "', Model Name: '" + getVehicleModelName() +
                "', Type: '" + getVehicleType() + "')";
    }
}
