package observer;

public class TheDailyMail implements Observer {
    
    @Override
    public void update(Message m){
    System.out.println("The DAily Mail :: " + m.getMessageContent());
    }
}
