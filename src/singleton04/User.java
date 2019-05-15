package singleton04;

import singleton03.Printer;

public class User 
{
		private String name;
		
		public User(String name)
		{
				this.name = name;
		}
		
		public void print()
		{
				Printer printer = Printer.getPrinter();
				printer.print("UserName : " + this.name + ", PrinterName : " + printer.toString());
		}
}
