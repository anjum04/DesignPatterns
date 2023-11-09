package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Group {
	
	List<Users> list = new ArrayList<>();
	
	public void subscribe(Users user)
	{
		list.add(user);
	}
	public void unsubscribe(Users user)
	{
		list.remove(user);
	}
	public void notify(String msg)
	{
		for(Users user:list)
		{
			user.notify(msg);
		}
	}

}
