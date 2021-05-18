package rides;

import bicycles.BicycleType;
import models.MountainBike;
import models.Tandem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RideTest {

    @Test
    public void testFunrideTandemCounter(){

        FunRide bicycle = new FunRide(3);
        Tandem tandem = new Tandem();
        Tandem tandem2 = new Tandem();
        Tandem tandem3 = new Tandem();
        bicycle.accept(tandem);
        bicycle.accept(tandem2);
        bicycle.accept(tandem3);
        assertEquals(3,bicycle.getCountForType(BicycleType.Tandem));
    }
    @Test
    public void testFunRideMountainBikeCounter(){

        FunRide bicycle = new FunRide(5);
        MountainBike mountainBike = new MountainBike();
        MountainBike mountainBike2 = new MountainBike();
        MountainBike mountainBike3 = new MountainBike();
        MountainBike mountainBike4 = new MountainBike();
        bicycle.accept(mountainBike);
        bicycle.accept(mountainBike2);
        bicycle.accept(mountainBike3);
        bicycle.accept(mountainBike4);
        assertEquals(4,bicycle.getCountForType(BicycleType.MountainBike));
    }
    @Test
    public void testingAllBicycleCounter(){
        FunRide bicycle = new FunRide(8);
        MountainBike mountainBike = new MountainBike();
        MountainBike mountainBike2 = new MountainBike();
        MountainBike mountainBike3 = new MountainBike();
        Tandem tandem = new Tandem();
        bicycle.accept(mountainBike);
        bicycle.accept(mountainBike);
        bicycle.accept(mountainBike2);
        bicycle.accept(mountainBike3);
        bicycle.accept(tandem);
        assertEquals(4,bicycle.getEnteredCount());
    }
}
