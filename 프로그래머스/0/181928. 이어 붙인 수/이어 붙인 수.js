function solution(num_list) {
    const {even, odd} = num_list.reduce((r, v) => {
        if (v % 2 == 0) {
            r.even += v;
        } else {
            r.odd += v;
        }
        
        return r;
    }, {even: "", odd: ""});
    return Number(even) + Number(odd);
}