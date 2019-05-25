package observer03;

import java.util.ArrayList;
import java.util.List;


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