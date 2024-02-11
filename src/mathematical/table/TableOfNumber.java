package mathematical.table;

public class TableOfNumber {
	public static void Table(int n1,int n2)
	{
		
		for(int i=1;i<=n2;i++)
		{
			System.out.println(n1+"*"+i+"="+n1*i);
		    Table(n1,n2);
		}
	}

}
