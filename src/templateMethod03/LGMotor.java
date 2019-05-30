package templateMethod03;

public class LGMotor extends Motor
{
	public LGMotor(Door door)
	{
		super(door);
	}
	
	@Override
	protected void moveMotor(Direction direction)
	{
		// LG Motor를 구동시킴
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
