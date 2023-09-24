class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double result =  ((double)num1 / (double)num2);
        int result2 = (int) (result * 1000);
        return result2;
    }
}