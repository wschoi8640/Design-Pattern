package state01;

public class Light 
{
		private static int ON = 0;
		private static int OFF = 1;
		private int state;
		
		public Light()
		{
				state = OFF;
		}
		
		public void turnOn()
		{
				if(state == ON)
				{
						System.out.println("반응 없음");
				}
				else
				{
						// 형광등이 꺼져 있을 때 ON 버튼을 누르면 켜진 상태로 전환됨
						System.out.println("불 켜기");
						state = ON;
				}
		}
		
		public void turnOff()
		{
				if(state == OFF)
				{
						System.out.println("반응 없음");
				}
				else
				{	
						// 형광등이 켜져 있을 때 OFF 버튼을 누르면 꺼진 상태로 전환됨
						System.out.println("불 끄기");
						state = OFF;
				}
		}
}
