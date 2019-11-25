package day1.classroom;

public class Mobile {

	public void makecall(String name) 
	{
		System.out.println("Make call to " + name);
	}

	public void sendsms(String textmessage) 
	{
		System.out.println("Send sms to JEFF " + textmessage);

	}

	/*public boolean sendsms() 
	{
		System.out.println("Send sms to JEFF");
		return true;

	}
*/
	public boolean shutDown() {
		System.out.println("Mobile is shutdown");
		return true;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Mobile phone = new Mobile();

		String name = "JEFF";
		phone.makecall(name);

		String textmessage = "Learning selenium";
//		phone.sendsms();
		phone.sendsms(textmessage);

		phone.shutDown();

	}

}
