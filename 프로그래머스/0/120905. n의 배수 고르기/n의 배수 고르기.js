function solution(n, numlist) {
    let tempArray = new Array(numlist.length);
    let count = 0;

    for (let num of numlist) {
        if (num % n === 0) {
            tempArray[count] = num;
            count++;
        }
    }

    
    let resultArray = new Array(count);
    for (let i = 0; i < count; i++) {
        resultArray[i] = tempArray[i];
    }

    return resultArray;
}