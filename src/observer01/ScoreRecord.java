package observer01;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord
{
	private List<Integer> scores = new ArrayList<Integer>();
	private ScoreView scoreView;
	
	public void setScoreView(ScoreView scoreView) 
	{
		this.scoreView = scoreView;
	};
	
	public void addScore(int score)
	{
		scores.add(score);
		scoreView.update();
	}
	
	public List<Integer> getScores()
	{
		return scores;
	}
}
