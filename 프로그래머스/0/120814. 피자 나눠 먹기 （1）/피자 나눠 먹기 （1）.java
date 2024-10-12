class Solution {
    public int solution(int n) {
        
        int piecesPerPizza = 7;
        
        
        int answer = (n + piecesPerPizza - 1) / piecesPerPizza;
        
        return answer;
    }
}