package singleton;

public class SingleChair {
    private static SingleChair onlyChair = new SingleChair();
    private SingleChair(){}
    public static SingleChair getonlyChair(){
        if(onlyChair == null)
            onlyChair = new SingleChair();
        
    return onlyChair;
    }    public void Message2u(){
    System.out.println("This is the only chair");
    }
}
