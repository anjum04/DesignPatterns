package FactoryDesginPattern;

public class NotificationFactory {
	
	   public Notification createNotification(String channel)
	   {
		   if(channel==null || channel.isEmpty()==true)
			   return null;
		   switch(channel)
		   {
		   		case "SMS":
		   			return new SMSNotification();
		   		case "Email":
		   			 return new EmailNotification();
		   		case "Push":
		   			return new PushNotification();
		   }
		return null;
	   }

}
