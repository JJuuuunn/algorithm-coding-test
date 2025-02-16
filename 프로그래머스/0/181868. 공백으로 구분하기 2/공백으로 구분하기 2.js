function solution(my_string) {
    return my_string.trim()
        .split('')
        .reduce((r, v) => {
            if (v !== ' ') {
                if (r.length === 0 || r[r.length - 1] === '') {
                    r.push(v);
                } else {
                    r[r.length - 1] += v;
                }
            } else {
                if (r.length === 0 || r[r.length - 1] !== '') {
                    r.push('');
                }
            }
            return r;
        }, [])
        .filter(v => v !== '');
}