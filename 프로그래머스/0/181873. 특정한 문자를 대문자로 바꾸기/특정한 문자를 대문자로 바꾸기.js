function solution(my_string, alp) {
    return [...my_string].reduce((r, v) => v === alp ? r += v.toUpperCase() : r += v, "");
}