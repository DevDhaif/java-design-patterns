package singleton;

public class FindOurChair {

    public static void main(String[] args) {
        SingleChair ourChair = SingleChair.getonlyChair();
        ourChair.Message2u();
    }
}