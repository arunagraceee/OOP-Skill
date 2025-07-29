package Skill1;
import java.util.Scanner;
public class Widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an integer value");
		   Scanner sc= new Scanner(System.in);
            int a;
            a=sc.nextInt();
            long b=a;
            System.out.println("The value in long type "+b);
            float c=b;
            System.out.println("The value in float type "+c);
            sc.close();
            
            
	}

}
