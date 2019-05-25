# observer02 의 문제점

* ScoreView_before.java

```java
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
```



* ScoreView_after.java

```java
	private void displayScores(List<Integer> scores)
	{
		int min = Collections.min(scores, null);
		int max = Collections.max(scores, null);
		
		System.out.println("Min : " + min + ", Max : " + max);
	}
```

* 기존의 ScoreView 클래스를 변경하여 새로운 ScoreView를 만들어 Max 와 Min 값을 출력하게 했다.

* 하지만 이는 기존의 코드를 변경해야 한다는 점에서 OCP에 위배된다. (매개변수의 갯수도 달라졌으므로 다른 클래스에도 영향을 미친다.)

