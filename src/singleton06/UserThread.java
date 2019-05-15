package singleton06;


public class UserThread extends Thread
{
		public UserThread(String name)
		{
				super(name);
		}
		
		public void run()
		{
				Printer printer = Printer.getPrinter();
				printer.print("UserName : " + Thread.currentThread().getName() + ", PrinterName : " + printer.toString());
		}
}
