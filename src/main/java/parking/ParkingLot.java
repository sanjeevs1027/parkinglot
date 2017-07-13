package parking;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sanjeev on 13/07/17.
 */
public class ParkingLot {
    private final int size;
    private final Set<Car> parkedCars;
    private ParkingLotEventListener parkingLotEventListener;
    private boolean capaCityReached = false;

    public ParkingLot(int size, ParkingLotEventListener parkingLotEventListener) {
        parkedCars =  new HashSet<Car>();
        this.size = size;
        this.parkingLotEventListener = parkingLotEventListener;
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
            parkingLotEventListener.notifyParkingLotIsFull();
            capaCityReached = true;
        }
        else if(capaCityReached) {
            parkingLotEventListener.notifyParkingLotIsAvailable();
            capaCityReached = false;
        }
    }

    public boolean isCarParked(Car car) {
        return parkedCars.contains(car);
    }

    public boolean isFull() {
        return (parkedCars.size()==size);
    }
}
