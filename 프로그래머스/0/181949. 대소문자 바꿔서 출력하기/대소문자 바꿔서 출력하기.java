import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] array0 = new char[a.length()];
        
        char[] array1 = new char[26];
        char[] array2 = new char[26];
        
        char x1 = 'a';
        char x2 = 'A';
        
        for(int i = 0 ; i < 26 ; i++){
            array1[i] = x1;
            array2[i] = x2;
            x1++;
            x2++;
        }
        
        for(int i = 0; i < a.length(); i++){
            for(int j = 0; j < array1.length; j++){
                if(a.charAt(i) == array1[j]){
                    array0[i] = array2[j];
                }
                
                else if(a.charAt(i) == array2[j]){
                    array0[i] = array1[j];
                }
            }
        }
        
        String answer = "";
        
        for(int i = 0 ; i < array0.length; i++){
            answer+=array0[i];
        }
        
        System.out.println(answer);
    }
}