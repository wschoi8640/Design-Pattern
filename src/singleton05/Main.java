package singleton05;

public class Main 
{
		private static final int THREADNUM = 5;
		public static void main(String[] args) 
		{
				UserThread[] userThread = new UserThread[THREADNUM];
				for(int i = 0; i < THREADNUM; i++)
				{
						userThread[i] = new UserThread((i+1) + "-Thread");
						userThread[i].start();
				}
		}
}
