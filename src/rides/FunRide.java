package rides;

import bicycles.Bicycle;
import bicycles.BicycleType;

import java.util.ArrayList;


public class FunRide {
 public int max;
 public int counter;

 private ArrayList<Bicycle> bicycleList= new ArrayList<>();
    public FunRide(int max){
        //sets maximum amount of rides allowed
         this.max = max;
    }
    public void accept(Bicycle bicycle){
        //accepts bicycles entering fun ride(adding to List) & incrementing the counter
        if((counter < max) &&  !(bicycleList.contains(bicycle))){
            bicycleList.add(bicycle);
            counter++;
        }
        }

    public int getCountForType(BicycleType bicycleType){
    //can tell how many bicycles are there for a specific type
       int specificCounter = 0;
      for (Bicycle bicycle : bicycleList){
          if(bicycleType == bicycle.getBicycleType()){
              specificCounter ++;
          }

      }
        return specificCounter;
    }
    public int getEnteredCount(){
       return bicycleList.size();
    }

}
