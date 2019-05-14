package strategy03;

public class Robot 
{
		private String name;
		private MovingStrategy movingStrategy;
		private AttackingStrategy attackingStrategy;
		
		public Robot(String name)
		{
				this.name = name;
		}
		
		public String getName()
		{
				return name;
		}
		
		public void move()
		{
				movingStrategy.move();
		}
		
		public void attack()
		{
				attackingStrategy.attack();
		}
		
		public void setMovingStrategy(MovingStrategy movingStrategy)
		{
				this.movingStrategy = movingStrategy;
		}
		
		public void setAttackingStrategy(AttackingStrategy attackingStrategy)
		{
				this.attackingStrategy = attackingStrategy;
		}
}
