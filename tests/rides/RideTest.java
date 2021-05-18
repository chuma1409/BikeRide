package rides;

import bicycles.Bicycle;
import bicycles.BicycleType;
import models.MountainBike;
import models.Tandem;
import org.junit.Test;
import specification.BicycleFromSpec;
import specification.BicycleSpecification;

import static org.junit.Assert.assertEquals;

public class RideTest {

    @Test
    public void bicycleSpecTestFunrideMountainBcounter(){

        FunRide bicycle = new FunRide(3);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        bicycle.accept(mountainBike);

        assertEquals(1,bicycle.getCountForType(BicycleType.MountainBike));
    }
    @Test
    public void testFunrideTandemCounter(){

        FunRide bicycle = new FunRide(3);
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(tandemBikeSpec);
        Bicycle tandem2 = new BicycleFromSpec(tandemBikeSpec);
        Bicycle tandem3 = new BicycleFromSpec(tandemBikeSpec);
        bicycle.accept(tandem);
        bicycle.accept(tandem2);
        bicycle.accept(tandem3);
        assertEquals(3,bicycle.getCountForType(BicycleType.Tandem));
    }
    @Test
    public void testFunRideRoadBikeCounter(){

        FunRide bicycle = new FunRide(5);
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadbike = new BicycleFromSpec(roadBikeSpec);
        Bicycle roadbike2 = new BicycleFromSpec(roadBikeSpec);
        Bicycle roadbike3 = new BicycleFromSpec(roadBikeSpec);
        Bicycle roadbike4 = new BicycleFromSpec(roadBikeSpec);
        bicycle.accept(roadbike);
        bicycle.accept(roadbike2);
        bicycle.accept(roadbike3);
        bicycle.accept(roadbike4);
        bicycle.accept(roadbike4);
        assertEquals(4,bicycle.getCountForType(BicycleType.RoadBike));
    }
    @Test
    public void testingAllBicycleCounter(){
        FunRide bicycle = new FunRide(8);
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle roadbike = new BicycleFromSpec(roadBikeSpec);
        Bicycle roadbike2 = new BicycleFromSpec(roadBikeSpec);
        Bicycle tandem = new BicycleFromSpec(tandemBikeSpec);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        bicycle.accept(roadbike);
        bicycle.accept(roadbike2);
        bicycle.accept(tandem);
        bicycle.accept(mountainBike);
        assertEquals(4,bicycle.getEnteredCount());
    }
}
