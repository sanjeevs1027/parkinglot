package parking;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sanjeev on 13/07/17.
 */
public class ParkingLotTest {

    Car car = new Car();
    ParkingLot parkingLot = new ParkingLot(5);

    @Test
    public void shouldAcceptTheCar() {
        Assert.assertTrue(parkingLot.accept(car));
    }

   @Test
    public void shouldReleaseCar() {
       parkingLot.accept(car);
       Assert.assertTrue(parkingLot.release(car));
   }

   @Test
    public void shouldRemoveCarFromParkedCarPoolWhenReleased () {
       parkingLot.accept(car);
       parkingLot.release(car);
       Assert.assertFalse(parkingLot.isCarParked(car));
   }

   @Test
    public void shouldReturnTrueWhenPrakingLotIsFull () {
        parkingLot.accept(new Car());
        parkingLot.accept(new Car());
        parkingLot.accept(new Car());
        parkingLot.accept(new Car());
        parkingLot.accept(new Car());

        Assert.assertTrue(parkingLot.isFull());

   }

   @Test
    public void shouldNotAcceptCarIfParkingLotIsFull () {
       parkingLot.accept(new Car());
       parkingLot.accept(new Car());
       parkingLot.accept(new Car());
       parkingLot.accept(new Car());
       parkingLot.accept(new Car());

       Assert.assertFalse(parkingLot.accept(car));
   }
}