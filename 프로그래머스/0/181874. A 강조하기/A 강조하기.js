function solution(myString) {
    return [...myString].reduce((r, v) => !["a", "A"].includes(v) ? r + v.toLowerCase() : r + "A", "");
}