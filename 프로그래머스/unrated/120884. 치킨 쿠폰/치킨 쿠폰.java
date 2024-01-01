class Solution {
    public int solution(int chicken) {
        int answer = -1;
        int coupon = chicken; 
		
		int service = coupon / 10; 
		int temp = coupon % 10;		
        
        
        while(true) {
		    coupon = (coupon/10) + temp;
			temp = coupon % 10;
			service += coupon / 10;
			
			if(temp == 10) {
				service += 1;
			}
			
			if(coupon < 10) {
				break;
			}
		}
        
        return service;
    }
}