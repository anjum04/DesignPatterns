package ObserverDesignPattern;

public class PublisherSubscriber {
	public static void main(String[] args)
	{
		Group group = new Group();
		
		Users user1 = new Users(1);
		Users user2 = new Users(2);
		Users user3 = new Users(3);
		
		group.subscribe(user1);
		group.subscribe(user2);
		group.subscribe(user3);
		
		group.notify("new message");
		
		group.unsubscribe(user2);
		
		group.notify("latest message");
		
		
		
		
	}

}
