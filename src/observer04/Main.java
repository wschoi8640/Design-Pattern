package observer04;

import java.util.ArrayList;

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

		scoreRecord.addObserver(scoreView03);
		scoreRecord.addObserver(scoreView05);
		scoreRecord.addObserver(scoreMinMaxView);
		
		for(int i = 1; i <= 5; i++)
		{
			int score = i * 10;
			System.out.println("adding " + score);
			scoreRecord.addScoreAndView(score);
		}
		
		scoreRecord.dropObserver(scoreView03);
		scoreRecord.setScores(new ArrayList<Integer>());
		
		for(int i = 1; i <= 5; i++)
		{
			int score = i * 10;
			System.out.println("adding " + score);
			scoreRecord.addScoreAndView(score);
		}
	}
}
