package AimsPackage;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public MyDate() {
		super();
		LocalDate currentdate = LocalDate.now();
		this.day = currentdate.getDayOfMonth();
		this.month = currentdate.getMonthValue();
		this.year = currentdate.getYear();
		
	}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public MyDate(String Date) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM dd yyyy");
		try {
			LocalDate date = LocalDate.parse( Date, dateFormat);
			this.day = date.getDayOfMonth();
			this.month = date.getMonthValue();
			this.year = date.getYear();	
		}catch(RuntimeException e){
			System.out.println("Date Error!");
		}
	}
	
	public void accept() {
		Scanner keyboard = new Scanner( System.in);
		String Date;
		System.out.println("Nhap date: ");
		Date = keyboard.next();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM dd yyyy");
		try {
			LocalDate date = LocalDate.parse( Date, dateFormat);
			this.day = date.getDayOfMonth();
			this.month = date.getMonthValue();
			this.year = date.getYear();	
		}catch(RuntimeException e){
			System.out.println("Date Error!");
		}
		keyboard.close();	
	}
	
	public void print() {
		System.out.println( this.month + " " + this.day + " " + this.year);
	}
}
