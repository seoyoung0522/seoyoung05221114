class Solution {
    public int solution(int price) {
        
        int discount = (price >= 500000) ? 20 : (price >= 300000) ? 10 : (price >= 100000) ? 5 : 0;
        return price * (100 - discount) / 100;
    }
}