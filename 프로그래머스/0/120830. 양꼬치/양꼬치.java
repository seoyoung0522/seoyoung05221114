class Solution {
     public static int solution(int a, int b) {
        
        int c = 12000; 
        int d = 2000;  
        
        int e = a * c; 
        
        int f = a / 10; 
        
        int g = b - f; 
        
        int h = Math.max(0, g) * d; 
        
        int i = e + h; 

        return i;
    }
}