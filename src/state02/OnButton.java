package state02;

public class OnButton implements Button
{
		private static OnButton onButton = new OnButton();
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
