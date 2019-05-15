package singleton05;

public class Printer 
{
		private static Printer printer = null;
		private int counter = 0;
		private Printer()
		{
				// do nothing
		}
		
		public static Printer getPrinter()
		{
				if(printer == null)
				{
						try 
						{
								Thread.sleep(1);
						} catch (InterruptedException e) 
						{
								e.printStackTrace();
						}
						printer = new Printer();
				}
				return printer;
		}
		
		public void print(String str)
		{
				counter++;
				System.out.println(str + ", counter : " + counter);
		}
}
