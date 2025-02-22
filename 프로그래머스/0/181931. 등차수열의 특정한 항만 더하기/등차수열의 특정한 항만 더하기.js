function solution(a, d, included) {
    return included.reduce((r, v, i) => {
        if (v) {
            r += (a + d * i);
        }
        return r;
    }, 0);
}