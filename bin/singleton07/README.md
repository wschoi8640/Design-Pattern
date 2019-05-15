# 해결책 - 2

```java
public class Printer 
{
		private static Printer printer = null;
		private int counter = 0;
		private Printer()
		{
			
		}
		
		public synchronized static Printer getPrinter()
		{
				if(printer == null)
				{
						printer = new Printer();
				}
				return printer;
		}
		
		public void print(String str)
		{
				synchronized(this)
				{
						counter++;
						System.out.println(str + ", counter : " + counter);
				}
		}
}
```

* 메서드와 소스 일부를 동기화 하여 자원과 메소드가 공유되도록 할 수 있다.

* 동기화를 사용하면 다른 스레드의 사용이 끝나고 나서 다른 스레드가 사용한다.