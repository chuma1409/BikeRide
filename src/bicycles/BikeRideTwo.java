package bicycles;

public class BikeRideTwo implements BikeRide{

    public final Bicycle bicycle;
    public BikeRideTwo(Bicycle bicycle) {
        this.bicycle=bicycle;

    }
    @Override
    public void ride(Bicycle bicycle) {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();

    }
    public int currentSpeed(){
        return this.bicycle.currentSpeed() ;
    }


}
