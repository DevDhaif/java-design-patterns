package observer;
import java.util.ArrayList;
import java.util.List;

public class MAgazinesList implements Subject { 
   
    private List<Observer> magazines = new ArrayList<>();
   
   public void attach(Observer observerMagazines){
   magazines.add(observerMagazines);
   }
   
   public void detach(Observer observerMagazines){
   magazines.remove(observerMagazines);
   }
   
   public void notifyAllMagazines(Message m){
   for (Observer observerMagazines : magazines){
   observerMagazines.update(m);
   }
   }
}
