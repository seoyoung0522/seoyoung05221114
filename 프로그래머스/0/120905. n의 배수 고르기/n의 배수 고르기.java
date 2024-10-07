class Solution {
    public int[] solution(int n, int[] numlist) {
       
 int[] tempArray = new int[numlist.length];
        int count = 0;

        for (int num : numlist) {
            if (num % n == 0) {
                tempArray[count] = num;
                count++;
            }
        }

        
        int[] resultArray = new int[count];
        for (int i = 0; i < count; i++) {
            resultArray[i] = tempArray[i];
        }

        return resultArray;
    }
}