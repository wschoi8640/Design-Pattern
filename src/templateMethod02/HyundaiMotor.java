package templateMethod02;

public class HyundaiMotor extends Motor
{
	public HyundaiMotor(Door door)
	{
		super(door);
	}

	private void moveHyundaiMotor(Direction direction)
	{
		// Motor를 구동시킴
	}
	
	public void move(Direction direction)
	{
		MotorStatus motorStatus = getMotorStatus();
		if(motorStatus == MotorStatus.MOVING) return;
		
		DoorStatus doorStatus = door.getDoorStatus();
		if(doorStatus == DoorStatus.OPENED) door.close();
		
		moveHyundaiMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}
}
