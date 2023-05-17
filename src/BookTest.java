public class BookTest {
    public static void main(String[] args) {
        // Q. [정수] 한 개를 저장할 [변수를 선언]하시오.
        int a;
        a = 10;
        System.out.println("a = " + a);

        // Q. [책] 한 권을 저장할 [변수를 선언]하시오.
        // 책을 저장할 자료형이 없다.

        // Q. 한 권의 책 데이터를 저장하고 출력하시오. 6개의 변수로
        String title = "자바";
        int price = 30000;
        String company = "패스트캠퍼스";
        String author = "박메일";
        int page = 700;
        String isbn = "ISBN -111990011";
        // 개별로 한 권의 책 데이터를 집어넣은 것이다. 한 권의 책이라고 볼 수 없다.
        // 기억 공간 6개를 하나의 구조로 설계해서 책 데이터를 넣으면 하나의 책 데이터라고 볼 수 있다.
        System.out.println(title + "\t" + price + "\t" + company + "\t" + author + "\t" + page + "\t" + isbn);
        // 인위적으로 책 한 권 처럼 보이게 했다.

        // Q. [책] 한 권을 저장할 [변수를 선언]하시오.
        Book b;
        // b = 책;  b에 어떻게 넣을 것인가? 이건 다음 시간에

    }
}
