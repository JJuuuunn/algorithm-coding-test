function solution(arr, queries) {
    return queries.reduce((answer, [s, e, k]) => {
        const temp = arr.reduce((acc, v, i) => {
            if (i >= s && i <= e && v > k) {
                acc.push(v);
            }
            return acc;
        }, []).sort((a, b) => a - b)[0];
        
        answer.push(temp !== undefined ? temp : -1);
        return answer;
    }, []);
}
