import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		boolean check = true;
		for(int i = 0, k = arr.length-1; i < arr.length; i++,k--) {
			if(arr[i] != arr[k]) {
				check = false;
				break;
			}
		}
		System.out.println(check ? 1 : 0);
	}
}