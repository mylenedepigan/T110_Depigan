import java.util.Scanner;

public class Main {
	static DataClass data = new DataClass(); 
	static Scanner scan = new Scanner(System.in);
	static Scanner scan2 = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		printScan(); 
		data.printAllData(); 
		
		printScan(); 
		printAllData2(); 
		
		scan.close();
	}
	
	static void printAllData2() {
		System.out.println("\n\n-Personal Data-");
		System.out.println("Full Name    : " + data.getName());
		System.out.println("Age          : " + data.getAge());
		System.out.println("Phone Number : " + data.getNumber());
		System.out.println("Address      : " + data.getAdress());
		
		System.out.println("\n-Student Grades-");
		System.out.println("P.E     : " + data.getpPEGrade());
		System.out.println("History : " + data.getHistoryGrade());
		System.out.println("English : " + data.getEnglishGrade());
		System.out.println("Sciende : " + data.getScienceGrade());
		System.out.println("Math    : " + data.getMathGrade());
		System.out.println("----------------------------------------------------------------------------\n");
	}
	
	static void printScan() {
		System.out.println("[Personal Data]");
		System.out.print("Full Name : ");
		data.insertStr(scan2.nextLine());
		
		System.out.print("Phone Number : ");
		data.insertStr(scan2.nextLine());
		
		System.out.print("Address : ");
		data.insertStr(scan2.nextLine());
		
		System.out.print("Age : ");
		data.insertData(scan.nextInt());
		
		System.out.println("\n[Input Grades]");
		System.out.print("Math    : ");
		data.insertData(scan.nextInt());
		
		System.out.print("Science : ");
		data.insertData(scan.nextInt());
		
		System.out.print("Englsih : ");
		data.insertData(scan.nextInt());
		
		System.out.print("History : ");
		data.insertData(scan.nextInt());
		
		System.out.print("P.E     : ");
		data.insertData(scan.nextInt());
		data.resetIJ();
	}

}
