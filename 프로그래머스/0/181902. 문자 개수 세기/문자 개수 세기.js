function solution(my_string) {
    return [...my_string].reduce((p, c) => {
        return (p[c.charCodeAt() - (c === c.toLowerCase() ? 71 : 65)]++, p)
    }, Array(52).fill(0));

}