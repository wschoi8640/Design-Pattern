package decorator02;

public class Main
{
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
}
