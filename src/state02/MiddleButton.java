package state02;

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
