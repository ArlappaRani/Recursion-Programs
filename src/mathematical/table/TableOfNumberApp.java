package mathematical.table;
import java.util.Scanner;
public class TableOfNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the  first number"); 
		int num1=scan.nextInt();
		System.out.println("Enter the second number");
		int num2=scan.nextInt();
		TableOfNumber.Table(num1,num2);

	}

}
