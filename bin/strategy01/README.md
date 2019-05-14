# Strategy01 의 문제점

```java
public abstract class Robot 
{
		private String name;
		public Robot(String name) 
		{
				this.name = name;
		}
		
		public String getName()
		{
				return name;
		}
		
		public abstract void attack();
		public abstract void move();
}
```
```java
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
```

* 기존 로봇의 공격 or 이동 방법을 수정하려면 어떤 변경작업이 필요한가? Atom이 뛰어다니게 하려면? IronMan이 수영하게 하려면?

* 새로운 로봇을 만들어 공격 or 이동 방법을 추가하려면? 
