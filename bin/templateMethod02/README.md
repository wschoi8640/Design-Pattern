# templateMethod02 의 문제점

* 상속을 통해 코드의 중복을 줄였지지만 여전히 HyundaiMotor 클래스와 LGMotor 클래스의 move 메소드가 중복된다.

* HyundaiMotor.java

```java
public void move(Direction direction)
{
		MotorStatus motorStatus = getMotorStatus();
		if(motorStatus == MotorStatus.MOVING) return;
		
		DoorStatus doorStatus = door.getDoorStatus();
		if(doorStatus == DoorStatus.OPENED) door.close();
		
		moveHyundaiMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
}
```

* LGMotor.java

```java
public void move(Direction direction)
{
		MotorStatus motorStatus = getMotorStatus();
		if(motorStatus == MotorStatus.MOVING) return;
		
		DoorStatus doorStatus = door.getDoorStatus();
		if(doorStatus == DoorStatus.OPENED) door.close();
		
		moveLGMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
}
```