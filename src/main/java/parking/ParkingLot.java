package parking;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sanjeev on 13/07/17.
 */
public class ParkingLot {
    private final int size;
    private final Set<Car> parkedCars;

    public ParkingLot(int size) {
        parkedCars =  new HashSet<Car>();
        this.size = size;
    }

    public boolean accept(Car car) {
        if (isFull())
            return false;

        return parkedCars.add(car);
    }

    public boolean release(Car car) {
        return parkedCars.remove(car);
    }

    public boolean isCarParked(Car car) {
        return parkedCars.contains(car);
    }

    public boolean isFull() {
        return (parkedCars.size()==size);
    }
}
