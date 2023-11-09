package FactoryDesginPattern;

public class SMSNotification implements Notification{

	@Override
	public void NotifyUser() {
		System.out.println("SMS Notification is sent");
		
	}

}
