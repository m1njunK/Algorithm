import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n*2-1; i++) {
			if(i < n) {
				for(int j = 0; j < n-(i+1); j++) {
					System.out.print(" ");
				}
				for(int k = 0; k < (i*2)+1; k++) {
					System.out.print("*");
				}
			}else {
				for(int j = 0; j < i-n+1; j++) {
					System.out.print(" ");
				}
				for(int k = 0; k < ((n*2-2)-i)*2+1; k++) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}