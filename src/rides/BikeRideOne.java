package rides;

import bicycles.Bicycle;
import rides.BikeRide;

public class BikeRideOne implements BikeRide {


   public final Bicycle bicycle;
        public BikeRideOne(Bicycle bicycle) {
        this.bicycle=bicycle;

    }


    @Override
    public void ride(Bicycle bicycle) {

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
