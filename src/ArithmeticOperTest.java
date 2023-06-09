public class ArithmeticOperTest {
    public static void main(String[] args) {
        // Q. 나누기와 나머지 연산자의 활용(정수의 자릿수 구하기)
        int digit = 3625;
        System.out.println(digit % 10); // 5
        System.out.println(digit / 10 % 10); // 2
        System.out.println(digit / 100 % 10); // 6
        System.out.println(digit / 1000 % 10); // 3

        int num = 2579; // 2 + 5 + 7 + 9 = ?
        int thou = (num / 1000 % 10);
        System.out.println("thou = " + thou);
        int hund = (num / 100 % 10);
        System.out.println("hund = " + hund);
        int ten = (num / 10 % 10);
        System.out.println("ten = " + ten);
        int one = (num % 10);
        System.out.println("one = " + one);
        System.out.println(thou + hund + ten + one);

        // 짝수인지(2로 나눠서 0이 되면) 홀수인지(나머지가 1이면) / 몇의 배수인지(3으로 나눠서 0이 되면 3의 배수)
        int su = 5;
        if(su % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
    }
}
