package bicycles;

abstract public class BicycleBase implements Bicycle{
private int speed;
protected void changeSpeed(int y){
    speed += y;
    }
    @Override
    public void accelerate() {

    }

    @Override
    public void brake() {

    }

    @Override
    public int currentSpeed() {
        return speed;
    }

    @Override
    public int stop() {
        return speed = 0;
    }

}


