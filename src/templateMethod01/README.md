# templateMethod01 의 문제점

* LGMotors가 아니라 다른 회사의 모터를 구동하고 싶다면?

```java
public class LGMotor
{
	private Door door;
	private MotorStatus motorStatus;
	
	public LGMotor(Door door) 
	{
		this.door = door;
		motorStatus = MotorStatus.STOPPED; // 초기에는 멈춘 상태
	}
	
	private void moveLGMotor(Direction direction)
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
		
		moveLGMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}
}
```

* HyundaiMotors와 중복되는 부분이 많음. 코드 중복은 유지보수성을 악화시키므로 바람직하지 않다.