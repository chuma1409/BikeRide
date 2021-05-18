package models;

import bicycles.Bicycle;
import bicycles.BicycleType;

public class Tandem implements Bicycle {
    int speed;
    @Override
    public void accelerate() {
        speed += 12;
    }

    @Override
    public void brake() {
        speed -= 7;
    }

    @Override
    public int currentSpeed() {
        return speed;

    }

    @Override
    public int stop() {
        return speed = 0;

    }

    @Override
    public BicycleType getBicycleType() {
        return BicycleType.Tandem;
    }
}
