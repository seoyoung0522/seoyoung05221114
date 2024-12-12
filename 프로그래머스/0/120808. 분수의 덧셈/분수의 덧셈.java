class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int k = numer1 * denom2; //첫번째 분수 분자
        int j = denom1 * denom2; //첫번째 분수 분모
        int h = numer2 * denom1; //두번째 분수 분자 
        int y = denom2 * denom1; //두번째 분수 분자
        int max = 0;
        
        for(int i = 1; i<=k+h && i<=y; i++){   
            if((k+h)%i==0 && y%i==0) {
                max = i;
            }
        }
        int lasta = (k+h)/max;
        int lastb = y/max;
        int answer[] = {lasta,lastb};
        return answer;
    }
}