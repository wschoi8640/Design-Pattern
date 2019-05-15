# 해결책 - 1

```java
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

```

* 정적 변수에서 인스턴스를 만들어 초기화 하는 방법

* 정적 변수는 객체가 생성되기 전 클래스가 메모리에 로딩될 때 만들어져 초기화가 한번만 실행된다.

* 정적 변수는 프로그램이 종료될때까지 없어지지 않고 메모리에 계속 상주한다.

* 다중 스레드에서 무력해졌던 if(printer == null)을 보완할 수 있다.