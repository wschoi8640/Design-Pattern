package singleton06;

public class Printer 
{
		private static Printer printer = new Printer();
		private int counter = 0;
		private Printer()
		{
				//do nothing
		}
		
		public static Printer getPrinter()
		{
				return printer;
		}
		
		public void print(String str)
		{
				counter++;
				System.out.println(str + ", counter : " + counter);
		}
}
