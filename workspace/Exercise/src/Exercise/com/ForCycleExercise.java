package Exercise.com;


public class ForCycleExercise 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++)
		{for (int n=2;n<=9;n++)
			if(i*n<10)
				{System.out.print(n + "x" + i + "=0" + (n*i) + " ");}
			else
				{System.out.print(n + "x" + i + "=" + (n*i) + " ");}
			
			
			System.out.println();
		}
			
	}

}
