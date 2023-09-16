import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		
		for(int k=0; k<2; k++) {
			for(int i=0; i<n;i++) {
				for(int j=0; j<m; j++) {
					arr[i][j] += sc.nextInt();
				}
			}
		}
		for(int AB[] : arr) {
			for(int x : AB) {
				System.out.print(x+" ");
			}
			System.out.println("");
		}
	}	
}