function solution(my_strings, parts) {
    const answer = my_strings.reduce((r, v, i) => r += v.substring(parts[i][0], parts[i][1] + 1), '');
    return answer;
}