public class MovieTest {
    public static void main(String[] args) {
        // Q. 아래에 예시된 한 편의 [영화] 데이터를 작성하고 출력하시오.
        Movie mv = new Movie();
        mv.title = "아바타";
        mv.day = "2202.12.14";
        mv.cha = "제이크 설리";
        mv.jan = "액션";
        mv.time = 192;
        mv.age = 12;
        System.out.println(mv.title + "\t" + mv.day + "\t" + mv.cha + "\t" + mv.jan + "\t" + mv.time + "\t" + mv.age + "세");

    }
}
