package parking;

/**
 * Created by sanjeev on 13/07/17.
 */
public class ParkingLotSecurity extends ParkingLotGeneralListener {

    private boolean securityRedirected = false;

    public void notifyParkingLotIsFull() {
        super.notifyParkingLotIsFull();
        securityRedirected = true;
    }

    public boolean isSecurityRedirected() {
        return securityRedirected;
    }
}
