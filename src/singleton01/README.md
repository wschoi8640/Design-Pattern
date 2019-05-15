# Singleton01 의 문제점

```java
public class Printer 
{
		public Printer()
		{
				// do nothing
		}
		
		public void print(String str)
		{
				System.out.println(str);
		}
}
```

* Printer가 하나밖에 없으면 new 생성자가 한 번만 호출되어야 한다.

* public 생성자의 경우 호출할때마다 생성되므로 이를 방지할 필요가 있다.