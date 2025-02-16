function solution(my_string) {
    return my_string.trim().split('').reduce((acc, char) => {
        if (char !== ' ') {
            if (acc.length === 0 || acc[acc.length - 1] === '') {
                acc.push(char);
            } else {
                acc[acc.length - 1] += char;
            }
        } else {
            if (acc.length === 0 || acc[acc.length - 1] !== '') {
                acc.push('');
            }
        }
        return acc;
    }, [])
    .filter(word => word !== '');
}