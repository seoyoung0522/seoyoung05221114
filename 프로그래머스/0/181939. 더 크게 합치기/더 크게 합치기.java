public class Solution {
    public int solution(int a, int b) {
        // 두 수를 문자열로 바꾼 뒤 이어붙임
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);
        
        // 두 값을 정수로 변환하여 비교
        int numAb = Integer.parseInt(ab);
        int numBa = Integer.parseInt(ba);
        
        // 더 큰 값을 반환 (같으면 a ⊕ b를 반환)
        if (numAb >= numBa) {
            return numAb;
        } else {
            return numBa;
        }
    }
}
