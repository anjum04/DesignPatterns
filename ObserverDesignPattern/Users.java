package ObserverDesignPattern;

public class Users implements Subscriber {
	
	private int userId;
	
	Users(int userId)
	{
		  this.userId=userId;
	}

	@Override
	public void notify(String msg) {
		System.out.println("User "+userId+" received message"+msg);
		
	}

}
