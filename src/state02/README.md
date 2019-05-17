# 해결책

* Button.java

```java
public interface Button 
{
		public void turnOn(Light light);
		public void turnOff(Light light);
}

```

* OnButton.java

```java
public class OnButton implements Button
{
		private static OnButton onButton = new OnButton(); // 싱글톤 패턴으로 미리 객체 생성 (메모리 절약)
		private Light light;
		
		public OnButton() {}
		
		public static OnButton getInstance()
		{
				return onButton;
		}
		
		@Override
		public void turnOn(Light light) 
		{
				System.out.println("취침등 켜기");
				light.setState(MiddleButton.getInstance());
				
		}
	
		@Override
		public void turnOff(Light light) 
		{
				System.out.println("불 끄기");
				light.setState(OffButton.getInstance());
		}

}
```

* MiddleButton.java

```java
public class MiddleButton implements Button
{

		private static MiddleButton middleButton = new MiddleButton();
		private Light light;
		
		public MiddleButton() {}
		
		public static MiddleButton getInstance()
		{
				return middleButton;
		}
	
		@Override
		public void turnOn(Light light) 
		{
				System.out.println("형광등 켜기");
				light.setState(OnButton.getInstance());
		}
	
		@Override
		public void turnOff(Light light) 
		{
				System.out.println("불 끄기");
				light.setState(OffButton.getInstance());
		}
}

```

* 스테이트 패턴(state pattern)은 행위를 수행할 때 상태에 행위를 수행하도록 위임한다.

* 이를 위해 스테이트 패턴에서는 각 상태를 클래스로 분리해 표현하고 각 클래스에서 상태에 맞는 행위를 메서드로 구현한다.

* 그리고 이러한 상태들을 캡슐화 하기 위해 인터페이스를 만들어 필요한 상태가 생기면 구현하도록 한다.

* 객체가 매번 새로 생성되는 것을 방지하기 위해 싱글톤 패턴을 사용하면 좋다.