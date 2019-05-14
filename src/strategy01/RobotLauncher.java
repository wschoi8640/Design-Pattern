package strategy01;

public class RobotLauncher 
{
		public static void main(String[] args) 
		{
				Robot ironMan = new IronMan("IronMan");
				Robot atom = new Atom("Atom");
				
				System.out.println("my name is " + ironMan.getName());
				ironMan.move();
				ironMan.attack();
				
				System.out.println("my name is" + atom.getName());
				atom.move();
				atom.attack();
		}

}
