function solution(my_string, m, c) {
    const arr = [...my_string].reduce((r, v, i) => {
        const rowIndex = Math.floor(i / m);

        if (!r[rowIndex]) r[rowIndex] = [];

        r[rowIndex].push(v);

        return r;
    }, []);

    return arr.map(row => row[c - 1]).join('');
}