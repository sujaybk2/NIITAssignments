package Course3.Sprint4PC2WorldOfVehicles;

public class ElectricEngine extends Engine {
    private double voltage;

    public ElectricEngine(String modelNo, double displacement, double maxPower, double maxRpm, int numOfCylinders, double voltage) {
        super(modelNo, displacement, maxPower, maxRpm, numOfCylinders);
        this.voltage = voltage;
    }
}
// getter and setter for voltage