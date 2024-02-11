package factorialprogram;
import java.util.Scanner;
public class FactorialOfNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		FactorialOfNumber.Fact(num);

	}

}
