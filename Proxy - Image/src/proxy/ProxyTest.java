package proxy;

public class ProxyTest {
    public static void main(String[] args){
        Image image =new RealImage("test2.jpg");
        
        image.displayImage();
        System.out.println("");
        
        image.displayImage();
    
    }
}