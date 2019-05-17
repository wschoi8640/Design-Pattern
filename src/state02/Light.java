package state02;

public class Light
{
		private Button stateModifier;
		
		public Light()
		{
				stateModifier = OffButton.getInstance();
		}
		
		public void setState(Button stateModifier)
		{
				this.stateModifier = stateModifier;
		}
		
		public void turnOn()
		{
				stateModifier.turnOn(this);
		}
		
		public void turnOff()
		{
				stateModifier.turnOff(this);
		}
}
