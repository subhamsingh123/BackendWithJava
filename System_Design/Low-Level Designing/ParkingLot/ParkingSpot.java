import ParkingLot.vehicleType.VehicleType;

public class ParkingSpot {
    
    private final int spotNumber;
    private final VehicleType vehicleType;
    private final Vehicle parkedVehicle;

    public ParkingSpot(VehicleType vehicleType, int spotNumber) {
        vehicleType = vehicleType;
        this.spotNumber = spotNumber;
    }

    
}
