public class ArrayBasicTest {
    public static void main(String[] args) {
        // Q. [정수 3개]를 저장 할 [변수를 선언]하고 모두 10을 저장하세요.
        int a, b, c;
        a = 10;
        b = 10;
        c = 10;
        int sum = a + b + c;
        System.out.println("sum = " + sum);

        // 이렇게 하면 어떤 문제가 있을까?
        // 데이터의 수가 늘어나면 비효율적이다. 개별로 만들면 데이터 처리가 복잡하다.
        // 연속적으로 되어있으면 반복문을 쉽게 이용할 수 있다.
        // 다른 메서드로 이동해서 계산하는 것이 불편하다. 배열 구조로 해야 편하다.
    }
}
