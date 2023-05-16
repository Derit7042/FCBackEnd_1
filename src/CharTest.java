public class CharTest {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println("c = " + c); // A
        int a = 'A';
        System.out.println("a = " + a);
        int b = 'B' + 1;
        System.out.println("b = " + b); //
        System.out.println("b = " + (char)b); // (char)b -> int 67 -> C casting(형 변환)

        // Q. '가' 라는 한글 한 문자를 변수에 저장하고 출력하시오.
        char han = '가';
        System.out.println("han = " + han);
        int hanD = '가'; // 44032
        System.out.println("hanD = " + hanD);
        int hanU = '\uAC00'; //  역슬래시u 로 되어 있는 것은 16진수로 표현했다는 의미로 보면 된다. 한글
        System.out.println("hanU = " + hanU);
        System.out.println("hanU = " + (char)hanU);

        // Q. 대문자 'A'를 소문자 'a'로 변환하여 출력하시오.(ASCII코드 참고).
        char upper = 'A';
        // char lower = upper + 32; // upper은 A이고 65이니까 65 + 32 = 97이다.
        // 97은 정수형이므로 4byte인데, char은 2byte이라서 4byte 정수가 2byte에 들어갈 수 없다.
        // 그러므로
        char lower = (char)(upper + 32); // 이렇게 강제로 char로 바꾸면 된다. 이게 캐스팅이다.
        System.out.println("lower = " + lower); // 'a'

        char lower1 = 'u'; // 117
        int upper1 = lower1 - 32; // 117 - 32 = 85 -> 'U'
        System.out.println("upper1 = " + upper1); // 85
        System.out.println("upper1 = " + (char)upper1); // 85를 U로 캐스팅

        // Q. '1' + '2' = 3 이 나오도록 프로그래밍 하시오.
        int data = '1' + '2';
        System.out.println("data = " + data); // 99 (아스키 코드 끼리 더해진다.)

        char i = '1'; // 49   49 - 48 = 1
        char j = '2'; // 50   50 - 48 = 2
        // int sum = (i - 48) + (j - 48);
        // System.out.println("sum = " + (char)sum); // 3
        int sum1 = (i - '0') + (j - '0');
        System.out.println("sum1 = " + sum1); // 3
    }
}
