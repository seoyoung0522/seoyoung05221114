function solution(n) {
    const piecesPerPizza = 7;
    const answer = Math.ceil(n / piecesPerPizza);
    return answer;
}