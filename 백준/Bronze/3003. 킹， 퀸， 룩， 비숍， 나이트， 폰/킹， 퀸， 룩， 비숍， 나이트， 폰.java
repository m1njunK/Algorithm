import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int king = 1 - sc.nextInt();
		int queen = 1 - sc.nextInt();
		int look = 2 - sc.nextInt();
		int vishop = 2 - sc.nextInt();
		int knight = 2 - sc.nextInt();
		int pawn = 8 - sc.nextInt();
		
		System.out.println(king + " " + queen + " " + look + " " + vishop + " " + knight + " " + pawn);
	}
}