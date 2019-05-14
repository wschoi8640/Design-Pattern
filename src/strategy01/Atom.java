package strategy01;

public class Atom extends Robot 
{
		public Atom(String name) 
		{
				super(name);
		}
	
		@Override
		public void attack() 
		{
				System.out.println("Punch");
		}
	
		@Override
		public void move() 
		{
				System.out.println("Run");
		}

}
