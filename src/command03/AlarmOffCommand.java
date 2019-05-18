package command03;

public class AlarmOffCommand implements Command
{
		private Alarm alarm;
		
		public AlarmOffCommand(Alarm alarm)
		{
				this.alarm = alarm;
		}
		
		@Override
		public void execute() 
		{
				alarm.stop();
		}
}
