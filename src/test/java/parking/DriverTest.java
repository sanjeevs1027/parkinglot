package parking;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sanjeev on 13/07/17.
 */
public class DriverTest
{
    Car car = new Car();
    ParkingLot parkingLot = new ParkingLot(5);
    Driver driver = new Driver(car);

    @Test
    public void shouldParkMyCar() {
        Assert.assertTrue(driver.park(parkingLot));
    }

    @Test
    public void shouldUnParkMyCar() {
        driver.park(parkingLot);
        Assert.assertTrue(driver.unPark(parkingLot));
    }
}
