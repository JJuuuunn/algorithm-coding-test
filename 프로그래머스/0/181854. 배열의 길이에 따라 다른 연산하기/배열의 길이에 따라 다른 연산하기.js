function solution(arr, n) {
    return arr.reduce((r, v, i) => {
        if (arr.length % 2 === 0 && i % 2 === 1) {
            v += n;
        } else if (arr.length % 2 === 1 && i % 2 ===0) {
            v += n; 
        }
        
        return [...r, v];
    }, []);
}