# state01 의 문제점

* Light.java(취침등 ver.)

```java
public void turnOn()
{
		if(state == ON)
		{
				System.out.println("취침등 켜기");
				state = SLEEPING;
		}
		else if(state == SLEEPING)
		{
				System.out.println("형광등 켜기");
				state = ON;
		}
		else
		{
				System.out.println("형광등 켜기");
				state = ON;
		}
}
```

* 형광등이 켜져있을때 On 버튼을 누르면 원래는 '반응없음' 이었지만 '취침등' 을 추가하고자 한다. 형광등 -> 취침등 -> 형광등 순이다.

* 추가 사항을 위해 코드를 확장할 때 조건문이 점점 복잡해지는 것을 확인 할 수 있다.