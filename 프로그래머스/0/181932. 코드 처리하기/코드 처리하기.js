function solution(code) {
    let flag = true; // true : 0, false : 1
    
    const ret = [...code].reduce((r, v, i) => {
        if (v == 1) {
            flag = !flag;
        } else if (flag && i % 2 === 0) {
            r += v;
        } else if (!flag && i % 2 === 1) {
            r += v;
        }
        
        return r;
    }, '');
    
    return ret == '' ? "EMPTY" : ret;
}