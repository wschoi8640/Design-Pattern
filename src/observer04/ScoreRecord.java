package observer04;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Target
{
	private List<Integer> scores = new ArrayList<Integer>();
	
	public void addScoreAndView(int score)
	{
		scores.add(score);
		notifyObservers();
	}
	
	public List<Integer> getScores()
	{
		return scores;
	}
	
	public void setScores(List<Integer> scores)
	{
		this.scores = scores;
	}
}
