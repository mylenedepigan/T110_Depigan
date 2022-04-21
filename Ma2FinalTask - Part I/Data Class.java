public class DataClass {
	private String name;
	private String number;
	private String address;
	private int age;

	private int english;
	private int science;
	private int math;
	private int history;
	private int pE;

	private int i = 0;
	private int j = 0;
	private String[] str = new String[4];
	private int[] arr = new int[7]; 

	public void insertStr(String name) {
		str[j] = name;
		j += 1;

		this.name = str[0];
		this.number = str[1];
		this.address = str[2];
	}

	public void insertData(int dataNum) {
		arr[i] = dataNum;
		i += 1;

		this.age = arr[0];
		this.math = arr[1];
		this.science = arr[2];
		this.english = arr[3];
		this.history = arr[4];
		this.pE = arr[5];
	}


	public String getName() {
		return this.name;
	}

	public String getNumber() {
		return this.number;
	}

	public String getAdress() {
		return this.address;
	}

	public int getAge() {
		return this.age;
	}

	public int getEnglishGrade() {
		return this.english;
	}

	public int getMathGrade() {
		return this.math;
	}

	public int getScienceGrade() {
		return this.science;
	}

	public int getHistoryGrade() {
		return this.history;
	}

	public int getpPEGrade() {
		return this.pE;
	}

	public void printAllData() {
		System.out.println("\n\n-Personal Data-");
		System.out.println("Full Name    : " + this.name);
		System.out.println("Phone Number : " + this.number);
		System.out.println("Address      : " + this.address);
		System.out.println("Age          : " + this.age);
		System.out.println("\n-Student Grades-");
		System.out.println("Math    : " + this.math);
		System.out.println("Sciende : " + this.science);
		System.out.println("English : " + this.english);
		System.out.println("History : " + this.history);
		System.out.println("P.E     : " + this.pE + "\n");
		System.out.println("----------------------------------------------------------------------------\n");
	}

	public void resetIJ() {
		i = 0;
		j = 0;
	}

}
