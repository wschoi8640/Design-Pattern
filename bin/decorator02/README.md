# 해결책

* 개별 추가 기능을 구현하는데 Decorator가 필요하다.

* Decorator는 공통되는 기본 기능을 호출 한뒤 추가적인 차별사항을 각자가 구현하도록 하는 클래스이다.

* 또한 이 패턴은 여러가지 조합을 만들어 낼 수 있다는 점에서 클래스를 불필요하게 만들 필요가 없다.

```java
public static void main(String[] args)
{
		Display road = new RoadDisplay();
		road.draw();
		
		Display roadWithLane = new LaneDecorator(new RoadDisplay());
		roadWithLane.draw(); // 기본 도로 + 차선 표시
		
		Display roadWithSign = new SignDecorator(new RoadDisplay());
		roadWithSign.draw(); // 기본 도로 + 신호 표시
		
		Display roadWithLaneAndSign = new LaneDecorator(new SignDecorator(new RoadDisplay()));
		roadWithLaneAndSign.draw(); // 기본 도로 + 신호 표시 + 차선표시
}
```