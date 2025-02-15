function solution(myString, pat) {
    return myString.split("")
        .reduce((r, v) => r + (v == "A" ? "B" : "A"), "")
        .includes(pat) ? 1 : 0;
}