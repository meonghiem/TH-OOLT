import hust.soict.hedspi.aims.utils.MyDate;
public class DateMain {
	public static void main(String[] args) {
		
		MyDate.print();
		System.out.println(MyDate.wordToNumber("twenty sixteen"));
		MyDate date = new MyDate("second", "September", "twenty sixteen");
		MyDate.anotherPrint();
		System.out.println(date);
	}
}
