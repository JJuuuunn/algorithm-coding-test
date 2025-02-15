function solution(arr) {
    return arr.reduce((r, v) => {
        return r.concat(Array(v).fill(v));
    }, []);
}
