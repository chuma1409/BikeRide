package bicycles;




 public interface Bicycle{
    public void accelerate();

    public void brake();

    public int currentSpeed();
    public int stop();
  }





//public class Bicycle {
//
//    int speed = 0;
//    public   void accelerate(){
//        speed += 5;
//
//    }
//    public  void brake(){
//        speed -=3;
//    }
//    public  int currentSpeed(){
//        return speed;
//    }
//    public int stop(){
//        return speed=0;
//    }
//    public void main(String[] args) {
//        accelerate();
//        brake();
//        accelerate();
//        stop();
//        accelerate();
//        accelerate();
//        brake();
//        System.out.println(currentSpeed());
//    }
//}
