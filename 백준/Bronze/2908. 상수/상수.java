import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		String re1 = "";
		String re2 = "";
				
		for(int i = 2; i >= 0; i--) {
			re1 += s1.charAt(i);
			re2 += s2.charAt(i);
		}
		
		int a = Integer.parseInt(re1);
		int b = Integer.parseInt(re2);
		
		if(a > b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}
}