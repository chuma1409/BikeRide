package bicycles.models;

import bicycles.*;

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
    @Test
    public void tandemShouldAccelerate() {
        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        assertEquals(12, bicycle.currentSpeed());
    }
    @Test
    public void tandemShouldDoMultipleAcceleratesCorrectly() {

        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(36, bicycle.currentSpeed());

    }
    @Test
    public  void tandemShouldAccelerateAndBrakeCorrectMountain() {

        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(5, bicycle.currentSpeed());

    }

    @Test
    public void tanemShouldaccelerateAndStop() {

        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.stop();
        System.out.println(bicycle.currentSpeed());
        assertEquals(0, bicycle.currentSpeed());
    }
    @Test
    public void RoadBikeShouldGetAccelerateAndBrake(){

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        assertEquals(4,roadBikeSpec.getBrakeSpeed());
        assertEquals(11,roadBikeSpec.getAccelerationSpeed());
        assertEquals(BicycleType.RoadBike,roadBikeSpec.getBicycleType());
    }
    @Test
    public void MountainBikeShouldGetAccelerateAndBrake(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        assertEquals(5,mountainBikeSpec.getAccelerationSpeed());
        assertEquals(3,mountainBikeSpec.getBrakeSpeed());
        assertEquals(BicycleType.MountainBike,mountainBikeSpec.getBicycleType());
    }
    @Test
    public void testFunrideTandemCounter(){

       FunRide bicycle = new FunRide(3);
       Tandem tandem = new Tandem();
       bicycle.accept(tandem);
        bicycle.accept(tandem);
        bicycle.accept(tandem);
        bicycle.accept(tandem);
        System.out.println(bicycle.getCountForType(BicycleType.Tandem));
       assertEquals(3,bicycle.getCountForType(BicycleType.Tandem));
    }
    @Test
    public void testFunRideMountainBikeCounter(){

        FunRide bicycle = new FunRide(5);
        MountainBike mountainBike = new MountainBike();
        bicycle.accept(mountainBike);
        bicycle.accept(mountainBike);
        bicycle.accept(mountainBike);
        bicycle.accept(mountainBike);
        System.out.println(bicycle.getCountForType(BicycleType.MountainBike));
        assertEquals(4,bicycle.getCountForType(BicycleType.MountainBike));
    }
    @Test
    public void testingAllBicycleCounter(){
        FunRide bicycle = new FunRide(8);
        MountainBike mountainBike = new MountainBike();
        Tandem tandem = new Tandem();
        bicycle.accept(mountainBike);
        bicycle.accept(mountainBike);
        bicycle.accept(mountainBike);
        bicycle.accept(tandem);
        System.out.println(bicycle.getEnteredCount());
        assertEquals(4,bicycle.getEnteredCount());
    }
}
