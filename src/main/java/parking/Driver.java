package parking;

/**
 * Created by sanjeev on 13/07/17.
 */
public class Driver {
    private Car myCar;

    public Driver(Car car) {
        this.myCar = car;
    }

    public boolean park(ParkingLot parkingLot) {
        return parkingLot.accept(myCar);
    }

    public boolean unPark(ParkingLot parkingLot) {
        return parkingLot.release(myCar);
    }
}
