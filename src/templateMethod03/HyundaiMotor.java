package templateMethod03;

public class HyundaiMotor extends Motor
{
	public HyundaiMotor(Door door)
	{
		super(door);
	}

	@Override
	protected void moveMotor(Direction direction)
	{
		// Hyundai Motor 구동
	}

	public void move(Direction direction)
	{
		MotorStatus motorStatus = getMotorStatus();
		if(motorStatus == MotorStatus.MOVING) return;
		
		DoorStatus doorStatus = door.getDoorStatus();
		if(doorStatus == DoorStatus.OPENED) door.close();
		
		moveMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}
}
