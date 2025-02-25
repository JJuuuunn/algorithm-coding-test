function solution(l, r) {
    const result = Array.from({ length: r - l + 1 }, (v, i) => l + i)
        .filter(num => {
            const strNum = num.toString();
            return [...strNum].every(c => c === '0' || c === '5');
        })
        .sort((a, b) => a - b);

    return result.length > 0 ? result : [-1];
}
