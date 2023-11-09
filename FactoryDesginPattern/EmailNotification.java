package FactoryDesginPattern;

public class EmailNotification implements Notification {

	@Override
	public void NotifyUser() {
		System.out.println("Email Notification is sent");
		
	}

}
