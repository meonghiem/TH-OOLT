import java.util.Scanner;
import java.lang.Math;
public class triangle {
	public static void tamgiac(int n) {
		for( int i = 1; i<= n ; i++) {
			for (int j = 1; j< 2*n; j++) {
				if(Math.abs(n -j) <= (i-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		tamgiac(n);
		keyboard.close();
	}
}
