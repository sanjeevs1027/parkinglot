package parking;

/**
 * Created by sanjeev on 13/07/17.
 */
public class ParkingLotGeneralListener implements  ParkingLotEventListener{
    private boolean parkingLotAvailable;

    public boolean isParkingLotFull() {
        return !parkingLotAvailable;
    }

    public void notifyParkingLotIsFull() {
        parkingLotAvailable = false;
    }

    public void notifyParkingLotIsAvailable(){
        parkingLotAvailable = true;
    }
}
