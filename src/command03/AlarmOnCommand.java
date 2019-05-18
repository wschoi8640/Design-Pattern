package command03;

public class AlarmOnCommand implements Command
{
		private Alarm alarm;
		
		public AlarmOnCommand(Alarm alarm) 
		{
				this.alarm = alarm;
		}
		
		@Override
		public void execute() 
		{
				alarm.start();
		}

}