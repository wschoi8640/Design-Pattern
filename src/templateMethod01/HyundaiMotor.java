package templateMethod01;

public class HyundaiMotor
{
	private Door door;
	private MotorStatus motorStatus;
	
	public HyundaiMotor(Door door) 
	{
		this.door = door;
		motorStatus = MotorStatus.STOPPED; // 초기에는 멈춘 상태
	}
	
	private void moveHyundaiMotor(Direction direction)
	{
		// Motor를 구동시킴
	}
	
	public MotorStatus getMotorStatus()
	{
		return motorStatus;
	}
	
	private void setMotorStatus(MotorStatus motorStatus)
	{
		this.motorStatus = motorStatus;
	}
	
	public void move(Direction direction)
	{
		MotorStatus motorStatus = getMotorStatus();
		if(motorStatus == MotorStatus.MOVING) return; // 이미 작동중일 경우 아무것도 하지 않음
		
		DoorStatus doorStatus = door.getDoorStatus();
		if(doorStatus == DoorStatus.OPENED) door.close();
		
		moveHyundaiMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}
}
