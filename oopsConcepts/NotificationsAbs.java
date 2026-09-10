package oopsConcepts;
abstract class Notification{
	abstract void send();
}
class Email extends Notification{
	@Override
	void send() {
		System.out.println("Sending Message Through Email");
	}	
}
class SMS extends Notification{
	@Override
	void send() {
		System.out.println("Sending Message Through SMS");
	}	
}
class WhatsApp extends Notification{
	@Override
	void send() {
		System.out.println("Sending Message Through WhatsApp");
	}	
}
public class NotificationsAbs {

	public static void main(String[] args) {
		Notification[]NotificationsAbs= {new Email(),new SMS(),new WhatsApp()};
		for(Notification n:NotificationsAbs) {
			n.send();
		}
	}

}
