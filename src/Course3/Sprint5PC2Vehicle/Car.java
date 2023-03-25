package Course3.Sprint5PC2Vehicle;


public class Car extends VehicleManufacturer implements Vehicle {
    public Car(String vehicleName, String vehicleModelName, String vehicleType) {
        setVehicleName(vehicleName);
        setVehicleModelName(vehicleModelName);
        setVehicleType(vehicleType);
    }

    @Override
    public int maxSpeed(String vehicleType) {
        if (vehicleType.equals("SportsCar")) {
            return 250;
        } else if (vehicleType.equals("Sedan")) {
            return 170;
        } else {
            return 0;
        }
    }

    @Override
    public String getManufacturerInformation() {
        return "Car (Manufacturer name: '" + getVehicleName() + "', Model Name: '" + getVehicleModelName() +
                "', Type: '" + getVehicleType() + "')";
    }
}
