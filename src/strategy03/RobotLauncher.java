package strategy03;

public class RobotLauncher 
{
		public static void main(String[] args) 
		{
				Robot ironMan = new IronMan("ironMan");
				Robot atom = new Atom("atom");
				
				ironMan.setAttackingStrategy(new MissileStrategy());
				ironMan.setMovingStrategy(new FlyingStrategy());
				
				atom.setAttackingStrategy(new PunchStrategy());
				atom.setMovingStrategy(new SwimmingStrategy());
				
				System.out.println("my Name is " + ironMan.getName());
				ironMan.move();
				ironMan.attack();
				
				System.out.println("my Name is " + atom.getName());
				atom.move();
				atom.attack();
		}
}
