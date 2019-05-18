# 해결책

* 버튼이 눌렸을 떄 실행될 기능을 클래스 외부에서 제공받아 캡슐화 해 pressed 메소드에서 호출한다.

```java
public class Main {

		public static void main(String[] args) 
		{
				Lamp lamp = new Lamp();
				LampOnCommand lampOnCommand = new LampOnCommand(lamp); // Command 인터페이스를 구현한 클래스
				
				Alarm alarm = new Alarm();
				AlarmOnCommand alarmOnCommand = new AlarmOnCommand(alarm);
				
				
				Button button1 = new Button(lampOnCommand); // 버튼 초기화시 행위 설정
				button1.pressed();
				button1.setCommand(lampOffCommand); // 버튼에 정해진 행위 변경 가능
				button1.pressed();
				button1.setCommand(alarmOnCommand);
				button1.pressed();
				button1.setCommand(alarmOffCommand);
				button1.pressed();
				
				Button button2 = new Button(alarmOnCommand);
				button2.pressed();				
				button2.setCommand(alarmOffCommand);
				button2.pressed();
				button2.setCommand(lampOnCommand);
				button2.pressed();
				button2.setCommand(lampOffCommand);
				button2.pressed();
		}

}
```