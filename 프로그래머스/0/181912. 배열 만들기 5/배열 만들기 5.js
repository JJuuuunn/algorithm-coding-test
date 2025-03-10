function solution(intStrs, k, s, l) {
    return intStrs.map((item) => Number(item.slice(s, s + l))).filter(x => x > k);
}
