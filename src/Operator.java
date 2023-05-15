public class Operator {
    public static void main(String[] args) {
        // 두 과목의 점수를 이용하여 총점과 평균을 출력하는 JavaSE프로그램을 만들어보자.
        int kor = 77;
        int eng = 87;
        int total = kor + eng;
        int avg = total / 2;

        System.out.println("총점: " + total);
        System.out.println("평균: " + avg);
    }
}
