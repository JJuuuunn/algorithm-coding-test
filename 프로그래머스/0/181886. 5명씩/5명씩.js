function solution(names) {
    return names.reduce((r, v, i) => i % 5 === 0 ? [...r, v] : r, []);
}