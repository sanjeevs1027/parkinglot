package parking;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sanjeev on 13/07/17.
 */
public class ParkingLotOwnerTest {

    ParkingLotOwner parkingLotOwner = new ParkingLotOwner();
    ParkingLot parkingLot = new ParkingLot(5, parkingLotOwner);

    @Test
    public void shouldNotifyParkingLotOwnerWhenParkinLotIsFull(){
        parkingLot.accept(new Car());
        parkingLot.accept(new Car());
        parkingLot.accept(new Car());
        parkingLot.accept(new Car());
        parkingLot.accept(new Car());
        Assert.assertTrue(parkingLotOwner.isParkingLotFull());
    }
}
