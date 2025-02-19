function solution(a, b) {
    const strA = a.toString();
    const strB = b.toString();
    
    const AB = Number(strA + strB);
    const BA = Number(strB + strA);
    
    return AB > BA ? AB : BA;
}