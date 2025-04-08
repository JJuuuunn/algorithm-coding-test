function solution(arr) {
    const firstIndex = arr.indexOf(2);
    const lastIndex = arr.lastIndexOf(2);
    
    if (firstIndex >= 0) {
        return arr.reduce((r, v, i) => {
            if (firstIndex <= i && i <= lastIndex) {
                r.push(v);
            }

            return r;
        }, []);
    } else {
        return [-1];
    }
}