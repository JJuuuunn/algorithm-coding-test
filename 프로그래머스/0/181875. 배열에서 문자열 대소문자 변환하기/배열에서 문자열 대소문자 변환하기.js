function solution(strArr) {
    return strArr.reduce((result, value, idx) => {
        if (idx % 2 === 1) {
            value = value.toUpperCase();
        } else {
            value = value.toLowerCase();
        }
        return [...result, value];
    }, []);
}