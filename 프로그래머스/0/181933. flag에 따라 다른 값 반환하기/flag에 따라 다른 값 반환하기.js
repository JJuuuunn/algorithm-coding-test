function solution(a, b, flag) {
    return [a, b].reduce((r, v) => flag ? a + b : a - b);
}