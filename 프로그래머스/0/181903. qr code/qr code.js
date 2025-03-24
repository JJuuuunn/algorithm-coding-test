function solution(q, r, code) {
    return [...code].reduce((result, value, idx) => {
        if (idx % q === r) {
            result += value;
        }
        
        return result;
    }, '');
}