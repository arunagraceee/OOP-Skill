package Skill3;
import java.util.Scanner;
public class Electricbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int units;
System.out.println("Enter the number of units consumed");
Scanner sc=new Scanner(System.in);
units=sc.nextInt();
if(units==51&&units<=100) {
	System.out.println("Bill amount: "+(units*3));
}
else if(units>=101&&units<=300) {
	System.out.println("Bill amount: "+(units*5+100));
}
else if(units>=301&&units<=450) {
	System.out.println("Bill amount: "+(units*5+200));
}
else if(units>450) {
	System.out.println("Bill amount: "+(units*8+250));
}
sc.close();
	}

}
