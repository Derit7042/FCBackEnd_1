public class FindAPI {
    public static void main(String[] args) {
        int a; // 변수 선언
        // AAA b;
        a = 10;
        System.out.println("a = " + a);
        // "APPLE" 문자열 저장하고 출력
        java.lang.String s;  // String 문자열 앞에 java.lang 가 생략되어 있다. java.lang -> 패키지(폴더)이다.
        // java 라는 폴더 아래에 lang 이라는 폴더 아래에 String 클래스가 있다는 경로를 한 줄로 표현한 것이다.
        // java 에 lang 에 있는 클래스들은 앞으로 자주 사용하는 클래스들이다.
        // 그래서 lang 안에 있는 클래스를 쓸 때는 앞에 java.lang. 이런 식으로 위치를 알려주지 않아도 상관 없다.
        // 컴파일러가 그런 클래스들이 자주 쓰는 클래스인지 알고있다. 그렇게 설계 했다.
        s = "APPLE";
        System.out.println("s = " + s);
        System.out.println(s.length());
    }
}
