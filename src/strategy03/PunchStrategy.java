package strategy03;

public class PunchStrategy implements AttackingStrategy
{
		@Override
		public void attack() 
		{
				System.out.println("punch");
		}
}
