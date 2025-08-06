package Skill3;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        n=sc.nextInt();
        int first=0,second=1;
        for(i=0;i<n;i++) {
        	System.out.println(first+" ");
        	int next=first+second;
        	first=second;
        	second=next;
        }
        sc.close();
	}

}
