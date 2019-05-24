package observer01;

public class Main
{
	public static void main(String[] args)
	{
		ScoreRecord scoreRecord = new ScoreRecord();
		
		// 3개 까지의 점수만 출력함
		ScoreView scoreView = new ScoreView(scoreRecord, 3);
		
		scoreRecord.setScoreView(scoreView);
		
		for(int i = 1; i <= 5; i++)
		{
			int score = i * 10;
			System.out.println("adding " + score);
			scoreRecord.addScore(score);
		}
	}

}
