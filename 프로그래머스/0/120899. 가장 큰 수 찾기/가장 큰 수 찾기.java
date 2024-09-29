class Solution {
    public int[] solution(int[] array) {
       
        if (array == null || array.length == 0) {
            return new int[] { -1, -1 }; 
        }

        int max = array[0];
        int index = 0;

        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        return new int[] { max, index };
    }
}