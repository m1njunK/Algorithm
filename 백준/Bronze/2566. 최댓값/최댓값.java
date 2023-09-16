import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[9][9];
		int max = 0;
		int answer[] = new int[2];
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				int n = sc.nextInt();
				arr[i][j] = n;
				if(n > max) {
					max = n;
					answer[0] = i+1;
					answer[1] = j+1;
				}
			}
		}
		if(max == 0) {
			answer[0] = 9;
			answer[1] = 9;
		}
		System.out.println(max);
		System.out.println(answer[0] + " " + answer[1]);
	}	
}