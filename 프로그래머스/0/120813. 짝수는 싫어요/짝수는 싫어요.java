class Solution {
    public int[] solution(int n) {
        int count = (n + 1) / 2; // 홀수 개수
        int[] oddNumbers = new int[count];
        
        for (int i = 0, num = 1; i < count; i++, num += 2) {
            oddNumbers[i] = num;
        }
        
        return oddNumbers;
    }
}