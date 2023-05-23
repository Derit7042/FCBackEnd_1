public class BasicArrayTest {
    public static void main(String[] args) {
        // Q. 실수 3개를 저장할 배열을 생성하고 값을 저장학 출력(기본배열)
        float[] f = {24.5f, 45.6f, 77.6f};
        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);

        // Q. [책] 3권을 저장할 [배열을 생성]하고 책 3권의 데이터를 저장하고 출력하시오.
        Book[] b = new Book[3]; // 객체배열
        b[0] = new Book();
        b[0].title = "자바";
        b[0].price = 30000;
        b[0].company = "한빛";
        b[0].author = "박매일";
        b[0].page = 500;
        b[0].isbn = "11889900";
        System.out.println(b[0].title + "\t" + b[0].price + "\t" + b[0].company + "\t" + b[0].author + "\t" + b[0].page + "\t" + b[0].isbn);

        b[1] = new Book();

        b[2] = new Book();
    }
}
