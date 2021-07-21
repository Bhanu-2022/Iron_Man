package Challenge;

public class Task4
{
	public static void main(String[] args) 
	{		
		System.out.println(isCatPlaying(true,56));
	}
		public static boolean isCatPlaying (boolean summer, int temperature)
		{
			if(summer==false && temperature>24 && temperature <36)
			{
							return true;
			} 
			else if(summer==true && temperature<=45)
			{
				
				return true;
			}
			else
				
			return false;
		}
	}



