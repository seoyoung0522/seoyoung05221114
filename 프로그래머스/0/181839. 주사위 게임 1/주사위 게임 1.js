function solution(a, b) {
    let score = 0;

        
        if (a % 2 === 1 && b % 2 === 1) {
            score = a * a + b * b; 
        } 
        
        else if (a % 2 === 1 || b % 2 === 1) {
            score = 2 * (a + b); 
        } 
       
        else {
            score = Math.abs(a - b); 
        }

        return score;
    }
