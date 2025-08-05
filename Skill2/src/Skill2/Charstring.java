package Skill2;
import java.util.Scanner;
public class Charstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch= {'H','E','L','L','O'};
		System.out.println("Enter a string");
		Scanner sc= new Scanner(System.in);
		 String inputs=sc.nextLine();
		String chars= new String(ch);
		System.out.println("Converted string from character array: "+chars);
		System.out.println("Input string: "+inputs);
		sc.close();

	}

}
