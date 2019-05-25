package observer03;

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
