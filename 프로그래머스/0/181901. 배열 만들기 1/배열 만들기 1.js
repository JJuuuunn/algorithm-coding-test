function solution(n, k) {
    const result = new Array(Math.floor(n / k));
    for (let i = 0; i < Math.floor(n / k); i++) {
        result[i] = k * (i + 1);
    }
    return result;
}
