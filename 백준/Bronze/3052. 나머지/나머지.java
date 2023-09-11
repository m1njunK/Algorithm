import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			arr[i] = a % 42;
		}
		int result = 1;
		Arrays.sort(arr);
		for(int i = 0; i < 9; i++) {
			if(arr[i] != arr[i+1]) {
				result++;
			}
		}
		System.out.println(result);
	}
}