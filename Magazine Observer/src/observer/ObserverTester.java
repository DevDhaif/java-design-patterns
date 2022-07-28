package observer;

public class ObserverTester {

    public static void main(String[] args) {
        TheDailyMail tdm = new TheDailyMail();
        NYTimes nyt = new NYTimes();
        
        MAgazinesList ml = new MAgazinesList();
        
        ml.attach(nyt);
        ml.attach(tdm);
        
        ml.notifyAllMagazines(new Message("This is the first message"));
        
        ml.detach(nyt);
        
        ml.notifyAllMagazines(new Message("This is another message"));
        
    }
}
