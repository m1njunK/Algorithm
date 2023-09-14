import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = s.toUpperCase();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		char maxChar = ' ';
		int max = Collections.max(map.values());
		int cnt = 0;
		for(char c : map.keySet()) {
			if(map.get(c) == max) {
				maxChar = c;
				cnt++;
			}
		}
		System.out.println(cnt == 1 ? maxChar : "?");
	}	
}