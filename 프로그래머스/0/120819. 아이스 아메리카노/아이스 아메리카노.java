class Solution {
    public int[] solution(int money) {
        int pricePerCoffee = 5500; 
        int maxCoffees = money / pricePerCoffee;
        int remainingMoney = money % pricePerCoffee; 
        
        return new int[] {maxCoffees, remainingMoney}; 
    }
}

    