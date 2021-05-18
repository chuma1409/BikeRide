package specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BicycleSpecTest {
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

}
