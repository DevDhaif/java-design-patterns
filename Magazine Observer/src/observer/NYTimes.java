package observer;

public class NYTimes  implements Observer {
    
    @Override
    public void update(Message m){
    System.out.println("NewYork Times :: " + m.getMessageContent());
    }
}
