import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			String x = sc.nextLine();
			x = x.replaceAll(" ", "").replaceAll("1", "");
			int cnt = x.length();
			switch (cnt) {
			case 1:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
				break;
			case 4:
				System.out.println("D");
				break;
			default:
				System.out.println("E");
				break;
			}
		}
	}
}