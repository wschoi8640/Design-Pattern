# Strategy02 의 문제점
* ironMan_before.java

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
				System.out.println("Swim");
		}
}
```

* ironMan_after.java

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

* 직접 소스를 변경하는 것은 OCP원칙에 위배된다.

* move나 attack 메소드가 같은 기능을 실행할 경우 중복상황이 발생

* 중복 상황의 경우 소스를 수정하거나 추가할때 일관성을 유지해야 하므로 오류의 위험을 내재 

* OCP 원칙

	* 확장에 개방적
	
	: 애플리케이션의 요구 사항이 변경될 때, 이 변경에 맞게 새로운 동작을 추가해 모듈을 확장할 수 있다.
	
	* 수정에 폐쇄적
	
	: 모듈의 소스 코드나 바이너리 코드를 수정하지 않아도 모듈의 기능을 확장하거나 변경할 수 있다.