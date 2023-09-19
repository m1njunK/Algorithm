import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean arr[][] = new boolean[100][100];
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					if(!arr[j][k]) {
						answer++;
						arr[j][k] = true;
					}
				}
			}
		}
		System.out.println(answer);
	}	
}