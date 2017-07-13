package parking;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sanjeev on 13/07/17.
 */
public class ParkingLot {
    private final int size;
    private final Set<Car> parkedCars;
    private ParkingLotOwner parkingLotOwner;

    public ParkingLot(int size, ParkingLotOwner parkingLotOwner) {
        parkedCars =  new HashSet<Car>();
        this.size = size;
        this.parkingLotOwner = parkingLotOwner;
    }

    public boolean accept(Car car) {
        if (isFull())
            return false;
        boolean result = parkedCars.add(car);
        assertCapacity();
        return  result;
    }

    public boolean release(Car car) {
        boolean result = parkedCars.remove(car);
        assertCapacity();
        return  result;
    }

    private void assertCapacity() {
        if(isFull()){
            parkingLotOwner.notifyParkingLotIsFull();
        }
        else{
            //TODO is available notification should be done only when it is changing to full to available
            parkingLotOwner.notifyParkingLotIsAvailable();
        }
    }

    public boolean isCarParked(Car car) {
        return parkedCars.contains(car);
    }

    public boolean isFull() {
        return (parkedCars.size()==size);
    }
}
