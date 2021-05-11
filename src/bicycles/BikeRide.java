package bicycles;

public class BikeRide {
   public final Bicycle bicycle;
//
    public BikeRide(Bicycle bicycle) {
        this.bicycle=bicycle;

    }
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }
    public int currentSpeed(){
       return this.bicycle.currentSpeed() ;
    }

}
