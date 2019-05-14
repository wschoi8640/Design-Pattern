package strategy03;

public class MissileStrategy implements AttackingStrategy
{
		@Override
		public void attack() 
		{	
				System.out.println("Launch missile");
		}
}
