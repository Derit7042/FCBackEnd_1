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
        m[1] = new Movie();
        m[1].title = "B영화";
        m[1].cha = "나길동";
        m[1].time = 180;
        m[1].age = 12;
        m[1].day = "2023-01-11";

        m[2] = new Movie();
        m[2] = new Movie();
        m[2].title = "C영화";
        m[2].cha = "조길동";
        m[2].time = 140;
        m[2].age = 18;
        m[2].day = "2023-11-16";

        // 반복문
        for(int i = 0; i < m.length; i++){
            System.out.println(m[i].title + "\t" + m[i].cha + "\t" + m[i].time + "\t" + m[i].age + "\t" + m[i].day);
        }

    }
}
