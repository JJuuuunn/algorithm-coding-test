function solution(num_list) {
    const sum = num_list.reduce((r, v, i) => {
        if (i % 2 === 0) {
            r[0] += v;
        } else {
            r[1] += v;
        }
        
        return r;
    }, [0, 0]);
    return sum[0] > sum[1] ? sum[0] : sum[1];
}