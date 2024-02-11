package factorialprogram;

public class FactorialOfNumber {
	public static void Fact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			 fact=fact*i;
			if(num==0)
			{
				return;
			}
			else
			{
			   
			  System.out.println("Factorial number"+fact);
		       Fact(num-1);
			}
			}
			
			
		}
	}


