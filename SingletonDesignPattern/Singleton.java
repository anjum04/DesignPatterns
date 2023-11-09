package SingletonDesignPattern;

public class Singleton {
	  private static Singleton obj;
	  
	    // private constructor to force use of
	    // getInstance() to create Singleton object
	   // lazy instantiation
	    private Singleton() {}
	 
	    public static Singleton getInstance()
	    {
	        if (obj==null)
	            obj = new Singleton();
	        return obj;
	    }

}
