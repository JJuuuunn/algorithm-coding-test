function solution(numbers, n) {
    return numbers.reduce((r, v) => {
        if (r <= n) {
            r += v;
        }
        return r;
    }, 0);
}