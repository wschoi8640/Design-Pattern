# Singleton3 의 문제점

```java
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


* getPrinter() 메소드는 Printer 인스턴스가 이미 생성되어 있는지를 검사한다.

* 처음 호출된 경우 인스턴스를 생성한다. 

* static 으로 선언되었으므로 외부에서 정적으로 접근 가능하다.
