package parking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sanjeev on 13/07/17.
 */
public class ParkingLotSecurityTest {

    ParkingLotSecurity security = new ParkingLotSecurity();

    ParkingLot parkingLot = new ParkingLot(5);

    @Before
    public void setup() {
        parkingLot.subscribeParkingLotEvents(security);
    }

    @Test
    public void shouldNotifyParkingLotOwnerWhenParkinLotIsFull() {
        parkingLot.accept(new Car());
        parkingLot.accept(new Car());
        parkingLot.accept(new Car());
        parkingLot.accept(new Car());
        parkingLot.accept(new Car());
        Assert.assertTrue(security.isSecurityRedirected());
    }
}