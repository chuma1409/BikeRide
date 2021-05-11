package bicycles.models;

import bicycles.BikeRide;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class BicycleTest {
        @Test
    public void shouldAccelerate() {
        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        assertEquals(11, bicycle.currentSpeed());
    }
    @Test
    public  void shouldAccelerateAndBrakeCorrect() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(7, bicycle.currentSpeed());

    }
    @Test
    public void shouldDoMultipleAcceleratesCorrectly() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(33, bicycle.currentSpeed());

    }
    @Test
    public void shouldDoMultipleAccelerateAndBrakesCorrectly() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(10, bicycle.currentSpeed());

    }
    @Test
    public void shouldAccelerateMountain() {
        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());
    }
    @Test
    public  void shouldAccelerateAndBrakeCorrectMountain() {

        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(2, bicycle.currentSpeed());

    }
    @Test
    public void shouldDoMultipleAcceleratesCorrectlyMountain() {

        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(15, bicycle.currentSpeed());

    }
    @Test
    public void shouldDoMultipleAccelerateAndBrakesCorrectlyMountain() {

        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(1, bicycle.currentSpeed());

    }
}
