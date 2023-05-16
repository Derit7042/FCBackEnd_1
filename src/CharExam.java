public class CharExam {
    public static void main(String[] args) {
        char a = '1';
        char b = '2';
        char c = '3';
        char d = '4';
        char e = '5';
        int sum = (a - '0') + (b - '0') + (c - '0') + (d - '0') + (e - '0');
        System.out.println("sum = " + sum);

        // Q. '1' + '2' + '3' + '4' + '5' = 15이 나오도록 프로그래밍 하시오.
        int som = 0; // '0' -> 48
        som = som + ('1' - '0'); // '1' -> 49   '1'(49) - '0'(48) = 1
        som = som + ('2' - '0');
        som = som + ('3' - '0');
        som = som + ('4' - '0');
        som = som + ('5' - '0');
        System.out.println("som = " + som); // 255
        // System.out.println(); // 개행, 줄바꿈

    }
}
