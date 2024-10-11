import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열과 정수 n을 공백으로 구분하여 한 줄에 입력 받기
        String str = sc.next();
        int n = sc.nextInt();

        // 문자열을 n번 반복하여 출력
        String result = str.repeat(n);
        System.out.print(result);

         sc.close();
    }
}
        
       
    