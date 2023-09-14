import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.trim();
		int cnt = 0;
		if(s.length() > 0) {
			cnt = 1;
		}
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}