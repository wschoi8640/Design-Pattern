# decorator01 의 문제점

* 또 다른 도로 표시 기능을 추가로 구현하고 싶다면 어떻게 해야 하는가?

```java
public class RoadDisplayWithSign extends RoadDisplay 
{
		public void draw()
		{
				super.draw();
				drawSign();
		}
		
		public void drawSign()
		{
				System.out.println("교통 신호 표시");
		}
}
```

* 여러가지 추가 기능을 조합해 제공하고 싶다면 어떻게 해야 하는가?

```
기능의 조합별로 클래스를 만든다.
```