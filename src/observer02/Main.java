package observer02;

public class Main
{
	public static void main(String[] args)
	{
		ScoreRecord scoreRecord = new ScoreRecord();
		ScoreMinMaxView scoreMinMaxView = new ScoreMinMaxView(scoreRecord);
		
		scoreRecord.setScoreMinMaxView(scoreMinMaxView);
		
		for(int i = 1; i <= 5; i++)
		{
			int score = i * 10;
			System.out.println("adding " + score);
			scoreRecord.addScoreAndView(score);
		}
	}

}
