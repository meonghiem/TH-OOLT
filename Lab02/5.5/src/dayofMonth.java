import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class dayofMonth {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String[] Month31day = new String[] { "March", "Mar.", "Mar","3","January" , "Jan.","Jan","1" ,
				"May","5" ,"July", "Jul","Jul.", "7" ,  "October", "Oct.", "Oct", "10","August", "Aug.", "Aug", "8",
				"December", "Dec.", "Dec", "12"};
		List<String> List31day = new ArrayList<>(Arrays.asList(Month31day));
		
		String[] Month30day = new String[] { "June", "Jun","Jun.", "6","April", "Apr.", "Apr", "4",
				"September", "Sep.", "Sep", "9", "November", "Nom.", "Nom", "11" };
		List<String> List30day = new ArrayList<>(Arrays.asList(Month30day));

		String[] febuary = new String[] {"Febuary" , "Feb." , "Feb" , "2"};
		List<String> febList = new ArrayList<>(Arrays.asList(febuary));
		System.out.println("Nhap nam");
		int year;
		try {
			year = keyboard.nextInt();
			while( year < 1000) {
				System.out.println("Nhap lai");
				year = keyboard.nextInt();	
			}
		}catch (Exception e) {
			System.err.println(e);
			System.out.println("Nhap lai");
			year = keyboard.nextInt();
		}
		
		keyboard.nextLine(); // remove buffer
		System.out.println("Nhap thang");
		String month = keyboard.nextLine();
		while( febList.contains(month) == false && 
				List31day.contains(month) == false && List30day.contains(month) == false)
		{
			System.out.println("Nhap lai");
			month = keyboard.nextLine();
		}
		if(febList.contains(month) == true) 
		{
			if( year % 4 == 0)
			{
				if( year % 100 == 0 && year % 400 != 0 )
				{
					System.out.println(month +" " + year +" co 28 days.");
				}else System.out.println(month +" " + year +" co 29 days.");
			} else System.out.println(month +" " + year +" co 28 days.");
		}else if(List31day.contains(month) == true) {
			System.out.println(month +" " + year +" co 31 days.");
		}else System.out.println(month +" " + year +" co 30 days.");
		keyboard.close();
		System.exit(0);
	}
}
