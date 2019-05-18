package command03;

public class Main {

		public static void main(String[] args) 
		{
				Lamp lamp = new Lamp();
				LampOnCommand lampOnCommand = new LampOnCommand(lamp);
				LampOffCommand lampOffCommand = new LampOffCommand(lamp);
				
				Alarm alarm = new Alarm();
				AlarmOnCommand alarmOnCommand = new AlarmOnCommand(alarm);
				AlarmOffCommand alarmOffCommand = new AlarmOffCommand(alarm);
				
				Button button1 = new Button(lampOnCommand);
				button1.pressed();
				button1.setCommand(lampOffCommand);
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
