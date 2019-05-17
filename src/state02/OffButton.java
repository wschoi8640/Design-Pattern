package state02;

public class OffButton implements Button
{

		private static OffButton offButton = new OffButton();
		private Light light;
		
		public OffButton() {}
		
		public static OffButton getInstance()
		{
				return offButton;
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
				System.out.println("반응 없음");
		}

}
