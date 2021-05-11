package bicycles.models;

import bicycles.Bicycle;
import bicycles.BicycleBase;

class RoadBike extends BicycleBase {
    int speed=0;
    @Override
    public void accelerate() {
        speed += 11;
    }

    @Override
    public void brake() {
        speed -= 4;
    }

    @Override
    public int currentSpeed() {
        return speed;
    }

    @Override
    public int stop() {
        return 0;
    }

}
