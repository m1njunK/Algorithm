import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[20];
		float answer = 0;
		float total = 0;
		for(int i=0; i<20; i++) {
			arr[i] = sc.nextLine();
			String arr2[] = arr[i].split(" ");
			total += Float.parseFloat(arr2[1]);
			switch (arr2[2]) {
				case "A+":
					answer += 4.5 * Float.parseFloat(arr2[1]);
					break;
				case "A0":
					answer += 4.0 * Float.parseFloat(arr2[1]);
					break;
				case "B+":
					answer += 3.5 * Float.parseFloat(arr2[1]);
					break;
				case "B0":
					answer += 3.0 * Float.parseFloat(arr2[1]);
					break;
				case "C+":
					answer += 2.5 * Float.parseFloat(arr2[1]);
					break;
				case "C0":
					answer += 2.0 * Float.parseFloat(arr2[1]);
					break;
				case "D+":
					answer += 1.5 * Float.parseFloat(arr2[1]);
					break;
				case "D0":
					answer += 1.0 * Float.parseFloat(arr2[1]);
					break;
				case "F":
					break;
				default:
					total -= Float.parseFloat(arr2[1]);
					break;
			}
		}
		System.out.println(answer / total);
	}	
}