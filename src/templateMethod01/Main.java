package templateMethod01;

public class Main
{

	public static void main(String[] args)
	{
		Door door = new Door();
		HyundaiMotor hyundaiMotor = new HyundaiMotor(door);
		hyundaiMotor.move(Direction.NORTH);
	}

}
