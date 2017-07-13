package parking;

/**
 * Created by sanjeev on 13/07/17.
 */
public interface ParkingLotEventListener {

    public void notifyParkingLotIsFull();

    public void notifyParkingLotIsAvailable();
}
