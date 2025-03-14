function solution(my_string, s, e) {
    var answer = '';
    const target = my_string.substring(s, e + 1);
    const str = [...target].reduce((r, v) => r = v + r,'');
    
    return  my_string.replace(target, str);
}