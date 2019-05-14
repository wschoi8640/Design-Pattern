# 해결책

* 각 클래스에서 개별 기능 구현

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

* 기능을 캡슐화 해 미리 구현

```java
public interface MovingStrategy 
{
		public void move();
}

```

```java
public class FlyingStrategy implements MovingStrategy
{
		@Override
		public void move() 
		{
				System.out.println("Fly");
		}
}
```

* 무엇이 변화되는지 찾아서 변화되는 것을 클래스로 캡슐화 해야한다.

* 로봇 예제 처럼 새로운 기능이 추가될 경우 해당 기능을 캡슐화 해 기존의 기능을 쉽게 변경할 수 있게 한다.

* 스트래티지 패턴은 전략을 쉽게 바꿀 수 있도록 해주는 디자인 패턴이다.

* 프로그램에서 전략을 실행할 떄는 쉽게 전략을 바꿔야 할 필요도 함께 생긴다. 이러한 상황에서 스트래티지 패턴이 유용하다. 