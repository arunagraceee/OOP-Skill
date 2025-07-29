package Skill1;
import java.util.Scanner;
public class Narrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a double value");
		Scanner sc= new Scanner(System.in);
		double a;
		a=sc.nextDouble();
		int b=(int)a;
		System.out.println("The value in integer type is "+b);
		sc.close();
		

	}

}
