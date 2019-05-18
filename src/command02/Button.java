package command02;

public class Button 
{
		private Lamp lamp;
		private Alarm alarm;
		private Mode mode;
		
		public Button(Lamp lamp, Alarm alarm)
		{
				this.lamp = lamp;
				this.alarm = alarm;
		}
		
		public void setMode(Mode mode)
		{
				this.mode = mode;
		}
		
		public void pressed()
		{
				switch(mode)
				{
						case LAMP:
							lamp.turnOn();
							break;
						case ALARM:
							alarm.start();
							break;
				}
		}
}
