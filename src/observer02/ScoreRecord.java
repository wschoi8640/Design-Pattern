package observer02;

import java.util.ArrayList;
import java.util.List;


public class ScoreRecord
{
	private List<Integer> scores = new ArrayList<Integer>();
	private ScoreMinMaxView scoreMinMaxView;
	
	public void setScoreMinMaxView(ScoreMinMaxView scoreMinMaxView) 
	{
		this.scoreMinMaxView = scoreMinMaxView;
	};
	
	public void addScoreAndView(int score)
	{
		scores.add(score);
		scoreMinMaxView.update();
	}
	
	public List<Integer> getScores()
	{
		return scores;
	}
}