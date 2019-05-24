package observer01;

import java.util.List;

public class ScoreView
{
	private ScoreRecord scoreRecord;
	private int viewCount;
	
	public ScoreView(ScoreRecord scoreRecord, int viewCount)
	{
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}
	
	public void update()
	{
		List<Integer> scores = scoreRecord.getScores();
		displayScores(scores, viewCount);
	}
	
	private void displayScores(List<Integer> scores, int viewCount)
	{
		int i = 0;
		System.out.println("List of " + viewCount + " entries : ");
		if(scores.size() - viewCount < 0) 
		{
			i = 0;
		}
		else
		{
			i = scores.size()-viewCount;
		}
		for (i = i; i < scores.size(); i++) 
		{
			System.out.println(scores.get(i) + " ");
		}
		System.out.println();
	}
}
