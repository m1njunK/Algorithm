import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int arr[][] = new int[t][4];
		
		for(int i=0; i<t; i++) {
			int c = sc.nextInt();
			arr[i][0] = c/25;
			c %= 25;
			arr[i][1] = c/10;
			c %= 10;
			arr[i][2] = c/5;
			c %= 5;
			arr[i][3] = c;
		}
		for(int x[] : arr) {
			for(int y : x) {
				System.out.print(y + " ");
			}
			System.out.println("");
		}
	}	
}