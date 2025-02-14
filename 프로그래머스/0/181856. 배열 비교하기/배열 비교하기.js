function solution(arr1, arr2) {
    const sum1 = arr1.reduce((r, v) => r + v);
    const sum2 = arr2.reduce((r, v) => r + v);
    return arr1.length == arr2.length ? sum1 > sum2 ? 1 : sum1 == sum2 ? 0 : -1 : arr1.length > arr2.length ? 1 : -1;
}