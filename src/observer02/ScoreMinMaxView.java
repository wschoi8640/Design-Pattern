package observer02;

import java.util.Collections;
import java.util.List;

public class ScoreMinMaxView
{
	private ScoreRecord scoreRecord;
	
	public ScoreMinMaxView(ScoreRecord scoreRecord)
	{
		this.scoreRecord = scoreRecord;
	}
	
	public void update()
	{
		List<Integer> scores = scoreRecord.getScores();
		displayScores(scores);
	}
	
	private void displayScores(List<Integer> scores)
	{
		int min = Collections.min(scores, null);
		int max = Collections.max(scores, null);
		
		System.out.println("Min : " + min + ", Max : " + max);
	}
}
