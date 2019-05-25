package observer04;

import java.util.ArrayList;
import java.util.List;

public abstract class Target
{
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer observer)
	{
		observers.add(observer);
	}
	
	public void dropObserver(Observer observer)
	{
		observers.remove(observer);
	}
	
	public void notifyObservers()
	{
		for(Observer observer : observers)
		{
			observer.update();
		}
	}
}
