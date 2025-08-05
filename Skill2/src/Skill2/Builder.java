package Skill2;
import java.util.Scanner;
public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		StringBuilder sb1= new StringBuilder();
		StringBuilder sb2= new StringBuilder();
		System.out.println("Enter first string");
		sb1.append(sc.nextLine());
		System.out.println("Enter second string");
		sb2.append(sc.nextLine());
		System.out.println("Before joining: \nFirst string: "+sb1+"\nSecond string:"+sb2);
		sb1.append(sb2);
		System.out.println("After joining: \nFirst string: "+sb1+"\nSecond string: "+sb2);
		sc.close();

	}

}
