import AimsPackage.MyDate;
public class DateMain {
	public static void main(String[] args) {
		MyDate currDate = new MyDate();
		currDate.print();
		MyDate date1 = new MyDate( "December 31 2013");
		date1.print();
	}
}
