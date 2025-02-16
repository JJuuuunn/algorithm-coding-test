function solution(my_string, alp) {
    return my_string.split("").reduce((r, v) => {
        if (v === alp) {
            v = v.toUpperCase();
        }
        
        return r += v;
    }, "");
}