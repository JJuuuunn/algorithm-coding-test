function solution(rny_string) {
    return rny_string.split("").reduce((r, v) => {
        if (v == "m") {
            v = "rn";
        }
        
        return r + v;
    }, "");
}