package bicycles;

public class BicycleFromSpec extends BicycleBase {

    private final bicycles.BicycleSpecification BicycleSpecification;

public BicycleFromSpec(bicycles.BicycleSpecification bicycleSpecification){
    this.BicycleSpecification = bicycleSpecification;
}
   public void accelerationSpeed(){
    this.BicycleSpecification.getAccelerationSpeed();
   }

    public void brakeSpeed(){
    this.BicycleSpecification.getBrakeSpeed();
    }


}
