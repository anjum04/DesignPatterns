package SingletonDesignPattern;

public class SingletonDeadLock {
	 private static volatile SingletonDeadLock obj  = null;
	    private SingletonDeadLock() {}
	 
	    public static SingletonDeadLock getInstance()
	    {
	        if (obj == null)
	        {
	            // To make thread safe
	            synchronized (SingletonDeadLock.class)
	            {
	                // check again as multiple threads
	                // can reach above step
	                if (obj==null)
	                    obj = new SingletonDeadLock();
	            }
	        }
	        return obj;
	    }


}
