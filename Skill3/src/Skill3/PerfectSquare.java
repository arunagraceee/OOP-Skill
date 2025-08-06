package Skill3;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double root= Math.sqrt(n);
		if(root==(int)root) {
			System.out.println("It is a perfect square");
		}
		else {
			System.out.println("It is not a perfect square");
		}
		sc.close();

	}

}
