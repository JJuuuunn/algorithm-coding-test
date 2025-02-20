function solution(num_list, n) {
    return num_list.reduce((r, v, i) => {
        if (i % n === 0) {
            return [...r, v];
        } else {
            return r;
        }
    }, []);
}