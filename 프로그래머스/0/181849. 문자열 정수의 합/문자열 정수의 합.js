function solution(num_str) {
    return num_str.split("").reduce((r, v) => r + Number(v), 0);
}