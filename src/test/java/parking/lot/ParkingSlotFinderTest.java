package parking.lot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sanjeev on 13/07/17.
 */
public class ParkingSlotFinderTest
{
    Driver driver;
    Car car;
    ParkingArea parkingArea;

    @Before
    public void setUp() {
        car = new Car();
        driver = new Driver();
        parkingArea = new ParkingArea();
    }

    @Test
    public void shouldParkTheCar() {
        Assert.assertTrue(driver.park(car, parkingArea));

    }
}
