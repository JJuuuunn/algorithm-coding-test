function solution(arr, queries) {
    return queries.reduce((r, v) => {
        const num = arr[v[0]];
        arr[v[0]] = arr[v[1]];
        arr[v[1]] = num;
        
        return arr;
    }, arr);
}