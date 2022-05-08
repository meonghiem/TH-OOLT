import AimsPackage.MyDate;
public class DateMain {
	public static void main(String[] args) {
		
		MyDate.print();
		System.out.println(MyDate.wordToNumber("twenty one sixteen"));
		MyDate date = new MyDate("second", "September", "twenty sixteen");
		MyDate.anotherPrint();
		System.out.println(date);
	}
}
