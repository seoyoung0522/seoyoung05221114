public class Solution {
    public String solution(String my_string, int k) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            result.append(my_string);
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // 테스트 예제
        System.out.println(sol.solution("string", 3)); // "stringstringstring"
        System.out.println(sol.solution("love", 10));   // "lovelovelovelovelovelovelovelovelovelove"
    }
}