class Solution {
    public int solution(int n) {
      
        if (n < 0) {
            return 0; 
        }
        
       
        for (int i = 0; i * i <= n; i++) {
            if (i * i == n) {
                return 1; 
            }
        }
        
        return 2; 
    }
}