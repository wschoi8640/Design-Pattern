# Singleton04 의 문제점

* User.java

```java
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
```
* Printer.java

```
public class Printer 
{
		private static Printer printer = null;
		private Printer()
		{
			
		}
		
		public static Printer getPrinter()
		{
				if(printer == null)
				{
						printer = new Printer();
				}
				return printer;
		}
		
		public void print(String str)
		{
				System.out.println(str);
		}
}
```

* Printer 인스턴스가 성공적으로 하나만 만들어지고 여러곳에서 동일한 인스턴스를 사용하였다.

* 일반적으로 싱글톤 패턴은 위의 형태를 지칭한다.

* 그러나 다중 스레드를 사용할 경우 인스턴스가 1개 이상 생성되는 경우가 발생한다.
