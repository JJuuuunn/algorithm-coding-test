function solution(arr, queries) {
    return queries.reduce((acc, [s, e, k]) => {
        for (i = s; i <= e; i++) {
            if (i % k === 0) {
                acc[i]++;
            }
        }
        
        return acc;
    }, [...arr]);
}