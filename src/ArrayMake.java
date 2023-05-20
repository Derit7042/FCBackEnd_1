public class ArrayMake {
    public static void main(String[] args) {
        // Q. [정수 5개]를 저장 할 [배열을 생성]하시오.
        int[] a = new int[5];
        /*a[0] = 10;
        a[1] = 10;
        a[2] = 10;
        a[3] = 10;
        a[4] = 10;*/

        /*System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);*/
        // 이렇게 하면 데이터를 넣고 출력을 하는데 있어서 장점이 없다.
        // 정수가 5개가 아니라 50개라면 머리 아파진다. 그래서 반복문을 사용한다.
        // 반복문(for, while)
        for(int i = 0; i < a.length; i++) {
            a[i] = 10;
            System.out.println(a[i]);
        }




        float[] f = new float[5]; // 길이가 고정된다. 한 번 5개로 만들면 무조건 5개로 고정

        Book[] b = new Book[3]; // 책 3권을 저장할 배열을 생성
    }
}
