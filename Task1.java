package Challenge;

public class Taks1 
{
		public static void main(String[] args) 
		{
			System.out.println(getDurationString(181,5));
			System.out.println(getDurationString(180));
		}
		public static String getDurationString(int minutes, int seconds) 
		{
			int h=0,m=0,s=0;

			if (minutes >= 0 && seconds >= 0 && seconds < 60)
			{
				h=minutes/60;
				m=minutes%60;
				return h+" hours "+m+" minutes "+s+" seconds ";
			}

			return "invalid value";
		}
		public static String getDurationString(int seconds) 
		{
			if ( seconds>=0)
			{
			int minutes;
			int second;
			minutes=seconds/60;
			second=seconds%60;
			System.out.println("minutes "+second);
			}
			return "invalid values";
			}
	}

