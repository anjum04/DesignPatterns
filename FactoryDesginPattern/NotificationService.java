package FactoryDesginPattern;

public class NotificationService {
	public static void main(String[] args)
	{
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification= notificationFactory.createNotification("Push");
		notification.NotifyUser();
		
	}

}
