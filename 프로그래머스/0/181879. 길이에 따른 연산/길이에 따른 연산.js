function solution(num_list) {
    return num_list.reduce((r, v) => num_list.length > 10 ? r + v : r * v);
}