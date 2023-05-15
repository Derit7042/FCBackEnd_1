public class VDATest {
    public static void main(String[] args) {
        // Q. [정수 : int] 한 개를 저장하기 위해서 [변수를 선언]하시오.
        int v; // 변수 선언 -> 기억 공간 만들어짐
        v = 10;
        System.out.println("v = " + v); // a = 10
        // Q. 변수 a에 10을 저장하고 a에 저장된 값을 변수 b에 저장하고
        //변수 b에 10을 곱하여 변수 c에 저장하시오.
        int a = 10; // 변수 초기화
        int b = a;
        int c = b * 10;
        System.out.println("c = " + c);
        // Q. sum이라는 변수에 1 부터 5 까지의 수를 누적(accumulate)해서 출력하시오.

        // sum이라는 변수는 main이라는 메서드 안에서 만들어진 변수 즉, '지역변수'이다. 지역변수는 반드시 초기화를 해야한다.
        int sum = 0;
        sum = sum + 1; // 0 + 1
        sum = sum + 2; // 1 + 2
        sum = sum + 3; // 3 + 3
        sum = sum + 4; // 6 + 4
        sum = sum + 5; // 10 + 5
        // 위 부분은 규칙이 나온다. -> sum = sum + i   i는 1~5까지 증가한다.
        // 반복문(for, while)을 사용하면 한 문장으로 표한 가능하다.

        // Q. x = 10, y = 20을 저장하고 변수의 값을 서로 교환(swap)하여 출력하시오.
        // 임시 기억공간이 필요하다.
        // 1. temp(임시) = y;  2. x값을 y에 넣기 y = x;  3. x = temp;
        int x = 10;
        int y = 20;
        System.out.println("x = " + x + " : " + "y = " + y);
        // 교환(swap)
        int tmp;
        tmp = y;
        y = x;
        x = tmp;
        System.out.println("x = " + x + " : " + "y = " + y);
    }
}
