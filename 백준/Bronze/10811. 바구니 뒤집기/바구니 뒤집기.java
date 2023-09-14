import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = i+1;
		}
		
		int cp[] = arr.clone();
		
		for(int i = 0; i < m; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			
			for(int j = x, k = y; j <= y; j++,k--) {
				cp[k] = arr[j];
			}
			arr = cp.clone();
		}
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}
}