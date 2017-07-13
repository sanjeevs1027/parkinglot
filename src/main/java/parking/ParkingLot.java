package parking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sanjeev on 13/07/17.
 */
public class ParkingLot {
    private int size;
    List<Car> parkedCars = new ArrayList<Car>();

    public ParkingLot(int size) {
        this.size = size;
    }

    public boolean accept(Car car) {
        if (isFull() || isCarParked(car))
            return false;

        parkedCars.add(car);
        return true;
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
