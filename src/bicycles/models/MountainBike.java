package bicycles.models;

import bicycles.Bicycle;
import bicycles.BicycleBase;

class MountainBike extends BicycleBase {
    private int speed = 0;
    @Override
    public void accelerate() {
        speed += 5;
    }

    @Override
    public void brake() {
        speed -=3;
    }
    @Override
    public int stop(){
        return 0;
    }
    @Override
    public int currentSpeed() {
        return speed;
    }


}
