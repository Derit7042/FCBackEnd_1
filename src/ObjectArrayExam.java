public class ObjectArrayExam {
    public static void main(String[] args) {
        // Q. 영화 3편을 저장할 [배열을 생성]하고 영화 3편의 데이터를 저장하고 출력하세요.
        Movie[] m = new Movie[3];
        m[0] = new Movie();
        m[0].title = "A영화";
        m[0].cha = "박매일";
        m[0].time = 160;
        m[0].age = 15;
        m[0].day = "2023-01-15";



        m[1] = new Movie();
        m[2] = new Movie();

    }
}
