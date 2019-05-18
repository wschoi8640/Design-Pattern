# command01 의 문제점

1) 버튼을 눌렀을 때 램프가 켜지는 대신 다른기능을 실행하게 하려면 어떤 변경 작업이 필요한가? 예를 들어 버튼을 눌렀을 때 알람이 시작되게 하려면?

* Alarm.java

```java
public class Alarm
{
		public void start()
		{
				System.out.println("알람 울리기");
		}
}
```

* Button.java

```java
public class Button
{
		private Alarm alarm;
		
		public Button(Alarm alarm)
		{
				this.alarm = alarm;
		}
		
		public void pressed()
		{
				alarm.start();
		}
}
```

* 위처럼 알람이 동작하게 할 수 있지만, 기능을 변경하려고 기존 Button 클래스의 코드를 수정하는 것은 OCP에 위배된다.

* 버튼을 눌렀을때 정해진 기능이 수행되도록 만들었기 때문에 다른 기능을 추가하거나 변경할 때 OCP를 위배하게 되는것이다.