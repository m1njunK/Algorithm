class Solution {
    public String solution(String polynomial) {
        String answer = "";

        String[] arr = polynomial.replace("+","").split("  ");
        
        int xCount = 0;
        int num = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("x")){
                xCount += 1;
            }
            if(arr[i].length() > 1 && arr[i].indexOf("x") > -1){
                xCount += Integer.parseInt(arr[i].replace("x",""));
            }
            if(arr[i].indexOf("x") == -1){
                num += Integer.parseInt(arr[i]);
            }
        }
        
        if(xCount > 1){
            answer = answer + xCount + "x";
        }
        
        if(xCount == 1) {
        	answer = answer + "x";
        }
        
        if(xCount > 0 && num > 0){
            answer = answer + " + " + num;
        }else if(num > 0){
        	answer = answer + num;
        }

        
        
        return answer;
    }
}