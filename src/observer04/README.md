# 해결책

* ScoreRecord.java

```java
public class ScoreRecord extends Target
{
	private List<Integer> scores = new ArrayList<Integer>();
	
	public void addScoreAndView(int score)
	{
		scores.add(score);
		notifyObservers();
	}
	
	public List<Integer> getScores()
	{
		return scores;
	}
	
	public void setScores(List<Integer> scores)
	{
		this.scores = scores;
	}
}

```

* Target.java

```java
public abstract class Target
{
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer observer)
	{
		observers.add(observer);
	}
	
	public void dropObserver(Observer observer)
	{
		observers.remove(observer);
	}
	
	public void notifyObservers()
	{
		for(Observer observer : observers)
		{
			observer.update();
		}
	}
}
```

* main.java

```java
ScoreRecord scoreRecord = new ScoreRecord();
		
// 3칸씩 보여주는 ScoreView(Observer) 생성
ScoreView scoreView03 = new ScoreView(scoreRecord, 3);

// 5칸씩 보여주는 ScoreView(Observer) 생성
ScoreView scoreView05 = new ScoreView(scoreRecord, 5);

// 최대/ 최소 점수 보여주는 ScoreView(Observer) 생성
ScoreMinMaxView scoreMinMaxView = new ScoreMinMaxView(scoreRecord);

scoreRecord.addObserver(scoreView03);
scoreRecord.addObserver(scoreView05);
scoreRecord.addObserver(scoreMinMaxView);

scoreRecord.dropObserver(scoreView03);
```

* 출력 방식이 변경되더라도 ScoreRecord 클래스를 그대로 재사용할 수 있어야 한다.

* 따라서 ScoreRecord 에서 변화되는 부분을 일반화 시킬 필요가 있다.

* 출력 방식과 상관없이 동일한 상위 클래스를 가지고 있다면 한꺼번에 일반화 시킬수 있다.

* 새로운 방식을 추가할 때 상위 클래스를 상속받도록 하면 ScoreRecord의 변경없이 추가가 가능하다.

* 통보받는 대상이 Observer이며 Observer를 추가 또는 삭제할 수 있다.