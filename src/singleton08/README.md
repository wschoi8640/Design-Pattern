# 해결책 -3

* UserThread.java

```java
public class UserThread extends Thread
{
		public UserThread(String name)
		{
				super(name);
		}
		
		public void run()
		{
				Printer.print("UserName : " + Thread.currentThread().getName());
		}
}
```

* Printer.java

```java
public class Printer 
{
		private static int counter = 0;
		public synchronized static void print(String str)
		{
				counter++;
				System.out.println(str + ", counter : " + counter);
		}
}
```

* 굳이 싱글턴 패턴을 사용하지 않고 정적 메소드로 이루어진 정적 클래스를 사용하면 동일한 효과를 낼 수 있다.

* 싱글톤과 가장 큰 차이는 객체를 생성하지 않고 사용한다는 점이다.

* 컴파일 타임에 바인딩 되는 인스턴스 메소드보다 정적 메소드가 성능면에서 우수하다.