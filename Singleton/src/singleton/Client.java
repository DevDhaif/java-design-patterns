package singleton;

public class Client {
    public static void main(String[] args) {
    	
    	// Client will initiate an object with a value "First object"
        Singleton singleton = Singleton.getObject("First object");
        
        // Client will initiate an object again with a different value "Second object"
        Singleton anotherSingleton = Singleton.getObject("Second object");
        
        // Now let's check for the both initiated objects' values:
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
        
        // Both outputs above should be the same value "First object"
    }
}

