# Singleton02 의 문제점

```java
public class Printer 
{
		private Printer()
		{
				// do something
		}
		
		public void print(String str)
		{
				System.out.println(str);
		}
}
```

* 외부에서 호출 할 수 없는 상황이지만 인스턴스 자체를 생성할 수 없는 상태

* 인스턴스를 생성해줄 메소드가 필요하다. 