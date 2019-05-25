# observer03 의 문제점

```java
public class Main
{
	public static void main(String[] args)
	{
		ScoreRecord scoreRecord = new ScoreRecord();
		
		// 3칸씩 보여주는 ScoreView 생성
		ScoreView scoreView03 = new ScoreView(scoreRecord, 3);
		
		// 5칸씩 보여주는 ScoreView 생성
		ScoreView scoreView05 = new ScoreView(scoreRecord, 5);
		ScoreMinMaxView scoreMinMaxView = new ScoreMinMaxView(scoreRecord);

		// 리스트에 각 ScoreView 객체 추가
		scoreRecord.addScoreView(scoreView03);
		scoreRecord.addScoreView(scoreView05);
		scoreRecord.setScoreMinMaxView(scoreMinMaxView);
		
		for(int i = 1; i <= 5; i++)
		{
			int score = i * 10;
			System.out.println("adding " + score);
			scoreRecord.addScoreAndView(score);
		}
	}
}
```

* 다양한 종류의 출력방식을 위해 변형된 ScoreView를 만들어 냈다.

* ScoreView를 칸 수를 다르게 출력하기 위해  각각 다른 객체를 생성시켰다. (칸수는 생성자를 통해 설정)

* 이 경우에도 새로운 방식을 추가할 때 ScoreRecord 를 수정할 수 밖에 없다.