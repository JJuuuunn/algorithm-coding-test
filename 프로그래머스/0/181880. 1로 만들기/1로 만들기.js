function solution(num_list) {
    const func = (num) => {
        let count = 0;
        while(num > 1){
            num = num % 2 === 0 ? num / 2 : (num - 1) / 2;
            count++
        }
        return count;
    }
    
    return num_list.reduce((a,c) => a + func(c), 0);
}