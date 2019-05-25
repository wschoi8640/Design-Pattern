# observer03 의 문제점

```java
public class ScoreRecord
{
	private List<Integer> scores = new ArrayList<Integer>();
	
	private List<ScoreView> scoreViews = new ArrayList<ScoreView>();
	private ScoreMinMaxView scoreMinMaxView;
	
	public void addScoreView(ScoreView scoreView)
	{
		scoreViews.add(scoreView);
	}
	
	public void setScoreMinMaxView(ScoreMinMaxView scoreMinMaxView) 
	{
		this.scoreMinMaxView = scoreMinMaxView;
	};
	
	public void addScoreAndView(int score)
	{
		scores.add(score);
		
		for(ScoreView scoreView : scoreViews)
		{
			scoreView.update();
		}
		scoreMinMaxView.update();
	}
	
	public List<Integer> getScores()
	{
		return scores;
	}
}
```

* 다양한 종류의 출력방식을 위해 변형된 ScoreView를 만들어 냈다.

* ScoreView를 칸 수를 다르게 출력하기 위해  각각 다른 객체를 생성시켰다. (칸수는 생성자를 통해 설정)

* 이 경우에도 새로운 방식을 추가할 때 ScoreRecord 를 수정할 수 밖에 없다.