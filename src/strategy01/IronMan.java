package strategy01;

public class IronMan extends Robot
{
		public IronMan(String name) 
		{
				super(name);
		}
	
		@Override
		public void attack() 
		{
				System.out.println("Launch missile");
		}
	
		@Override
		public void move() 
		{
				System.out.println("Fly");
		}
}
