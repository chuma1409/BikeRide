package specification;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class BicycleFromSpec extends BicycleBase {

    private final specification.BicycleSpecification BicycleSpecification;

public BicycleFromSpec(specification.BicycleSpecification bicycleSpecification){
    this.BicycleSpecification = bicycleSpecification;
}
   public void accelerationSpeed(){
    this.BicycleSpecification.getAccelerationSpeed();
   }

    public void brakeSpeed(){
    this.BicycleSpecification.getBrakeSpeed();
    }


    @Override
    public BicycleType getBicycleType() {
        return this.BicycleSpecification.getBicycleType();
    }
}
