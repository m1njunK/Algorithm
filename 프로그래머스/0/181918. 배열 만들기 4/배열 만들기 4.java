import java.util.*;

class Solution {
    public List solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        int i = 0;
        
        while(true){

            if(i == arr.length){
                break;
            } 

            if(list.size() == 0){
                list.add(arr[i]);
                i++;
                continue;
            }

            if(list.get(list.size()-1) < arr[i]){
                list.add(arr[i]);
                i++;
                continue;
            }

            if(list.get(list.size()-1) >= arr[i]){
                list.remove(list.size()-1);
                continue;
            }
        }
        
        return list;
    }
}