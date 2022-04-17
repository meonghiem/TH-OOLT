import java.util.Arrays;
public class sortArray {
	public static void main(String[] args) {
		int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
		Arrays.sort(arr);
		System.out.println("Modified arr[] : "+
                Arrays.toString(arr));
		System.out.println("Sum: "+ Arrays.stream(arr).sum());
		System.out.println("Average: " + Arrays.stream(arr).sum()/arr.length);
	}
}
