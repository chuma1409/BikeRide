package bicycles;

public class BikeRideThree implements BikeRide{

    public final Bicycle bicycle;
    public BikeRideThree(Bicycle bicycle) {
        this.bicycle=bicycle;

    }
    @Override
    public void ride(Bicycle bicycle) {

        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();

    }
    public int currentSpeed(){
        return this.bicycle.currentSpeed() ;
    }

}
