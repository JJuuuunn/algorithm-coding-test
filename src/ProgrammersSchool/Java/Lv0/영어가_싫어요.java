package ProgrammersSchool.Java.Lv0;

public class 영어가_싫어요 {
    public static void main(String[] args) {

        String numbers = "onetwothreefourfivesixseveneightnine";
        System.out.println(solution(numbers));    //123456789

        numbers = "onefourzerosixseven";
        System.out.println(solution(numbers));    //14067


    }

    public static long solution(String numbers) {
        String str = numbers
                .replace("zero", "0")
                .replace("one", "1")
                .replace("two", "2")
                .replace("three", "3")
                .replace("four", "4")
                .replace("five", "5")
                .replace("six", "6")
                .replace("seven", "7")
                .replace("eight", "8")
                .replace("nine", "9");
        Long answer = Long.parseLong(str);
        return answer;
    }

    public static long solution2(String numbers) {
        String[] numbersStr = numbers.split("");

        String word = "";
        long num = 0;
        for (String str : numbersStr) {
            word += str;
            if (word.equals("zero")) {
                num = num * 10;
                word = "";
            } else if (word.equals("one")) {
                num = num * 10 + 1;
                word = "";
            } else if (word.equals("two")) {
                num = num * 10 + 2;
                word = "";
            } else if (word.equals("three")) {
                num = num * 10 + 3;
                word = "";
            } else if (word.equals("four")) {
                num = num * 10 + 4;
                word = "";
            } else if (word.equals("five")) {
                num = num * 10 + 5;
                word = "";
            } else if (word.equals("six")) {
                num = num * 10 + 6;
                word = "";
            } else if (word.equals("seven")) {
                num = num * 10 + 7;
                word = "";
            } else if (word.equals("eight")) {
                num = num * 10 + 8;
                word = "";
            } else if (word.equals("nine")) {
                num = num * 10 + 9;
                word = "";
            }
        }
        long answer = num;
        return answer;
    }
}
