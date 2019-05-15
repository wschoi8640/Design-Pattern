package singleton04;

public class Main 
{
		private static final int userNum = 5;
		public static void main(String[] args) 
		{
				User[] user = new User[userNum];
				for(int i = 0; i < userNum; i++)
				{
						user[i] = new User((i + 1) + "-user");
						user[i].print();
				}
		}

}
