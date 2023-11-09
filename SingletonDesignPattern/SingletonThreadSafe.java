package SingletonDesignPattern;

public class SingletonThreadSafe {
	
	 private static SingletonThreadSafe obj;
	    private SingletonThreadSafe() {}
	 
	    // Only one thread can execute this at a time
	    public static synchronized SingletonThreadSafe getInstance()
	    {
	        if (obj==null)
	            obj = new SingletonThreadSafe();
	        return obj;
	    }

}
