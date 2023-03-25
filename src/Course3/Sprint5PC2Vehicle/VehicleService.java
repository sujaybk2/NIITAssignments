package Course3.Sprint5PC2Vehicle;


public class VehicleService {
    public static void main(String[] args) {
        // Create a bike object
        Bike bike = new Bike("Yamaha", "R1", "Sports Bike");

        // Call maxSpeed method and print the speed
        int bikeMaxSpeed = bike.maxSpeed(bike.getVehicleType());
        System.out.println("Bike max speed: " + bikeMaxSpeed);

        // Call getManufacturerInformation method and print the output
        String bikeInfo = bike.getManufacturerInformation();
        System.out.println(bikeInfo);

        // Create a car object
        Car car = new Car("Santro", "Santro123", "Sedan");

        // Call maxSpeed method and print the speed
        int carMaxSpeed = car.maxSpeed(car.getVehicleType());
        System.out.println("Car max speed: " + carMaxSpeed);

        // Call getManufacturerInformation method and print the output
        String carInfo = car.getManufacturerInformation();
        System.out.println(carInfo);
    }
}
