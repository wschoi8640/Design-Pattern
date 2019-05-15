package singleton08;


public class UserThread extends Thread
{
		public UserThread(String name)
		{
				super(name);
		}
		
		public void run()
		{
				Printer.print("UserName : " + Thread.currentThread().getName());
		}
}
