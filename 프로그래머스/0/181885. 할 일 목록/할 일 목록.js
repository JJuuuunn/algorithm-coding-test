function solution(todo_list, finished) {
    return todo_list.reduce((r, v, i) => !finished[i] ? [...r, v] : r, []);
}