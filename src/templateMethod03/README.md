# 해결책

* 나머지 중복되던 부분도 추상 메소드로 만들어 상속하면 중복 문제가 해결된다.

* Motor.java

```java
public void move(Direction direction)
{
		MotorStatus motorStatus = getMotorStatus();
		if(motorStatus == MotorStatus.MOVING) return;
		
		DoorStatus doorStatus = door.getDoorStatus();
		if(doorStatus == DoorStatus.OPENED) door.close();
		
		moveMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
}
	
protected abstract void moveMotor(Direction direction);
```
