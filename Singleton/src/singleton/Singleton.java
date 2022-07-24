package singleton;

public final class Singleton {
	
	// let's first make the Singleton object null 
    private static Singleton object=null;
    
    // I will use this passed value to check the output is not the same for both two objects later
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton  getObject(String value) {
    	// I will check first if the object is null, if not I will just return it.
        if (object== null) {
        	// synchronized makes sure that only one thread at a time can execute getObject()
        	synchronized (Singleton.class) {
        		object = new Singleton(value);
			}
        }
        
        return object;
    }
}
