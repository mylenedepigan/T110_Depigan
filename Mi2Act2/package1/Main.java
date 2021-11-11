package package1;

import java.util.Scanner;
import package2.Main_2;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter your full name: ");
	    String name = scan.nextLine();
		System.out.print("Enter your age      : ");
	    int age = scan.nextInt();
		System.out.print("Enter your voter ID : ");
		int id = scan.nextInt();
		
		Main_2 Obj = new Main_2(age);
		System.out.print("\n[INFO]");
		System.out.print("\nName: "+ name);
		System.out.print("\nAge : "+ age);
		System.out.print("\nID  : "+ id);
	}
}
