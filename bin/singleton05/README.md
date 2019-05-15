# Singleton06 의 문제점

```java
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

```

* 각 Thread 마다 각기 다른 Printer 인스턴스가 만들어진다.

* 인스턴스가 유지해야할 값이 있다면 문제가 될 수 있다.

* Thread-Safe 한 싱글톤 패턴은 추가적인 조치가 필요하다.