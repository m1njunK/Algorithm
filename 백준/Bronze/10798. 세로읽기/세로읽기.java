import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[][] = new String[5][15];
		for(int i=0; i<5; i++) {
			Arrays.fill(arr[i], "");
		}
		for(int i=0; i<5; i++) {
			String s = sc.next();
			for(int j=0; j<s.length();j++) {
				arr[i][j] = s.charAt(j)+"";
			}
		}
		String answer = "";
		for(int j=0; j<15; j++) {
			for(int i=0; i<5; i++) {
				answer+=arr[i][j];
			}
		}
		System.out.println(answer);
	}	
}