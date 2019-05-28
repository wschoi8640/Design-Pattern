package decorator01;

public class Main
{
	public static void main(String[] args)
	{
		RoadDisplay road = new RoadDisplay();
		road.draw();
		
		RoadDisplay roadWithLane = new RoadDisplayWithLane();
		roadWithLane.draw();
	}
}
