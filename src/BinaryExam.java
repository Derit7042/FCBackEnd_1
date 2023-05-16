public class BinaryExam {
    public static void main(String[] args) {
        // Q. 123을 10진수, 2진수, 8진수, 16진수로 출력하시오 (BinaryExam 클래스)
        int decimal = 123;
        System.out.println("decimal = " + decimal);
        int binary = 0b01111011;
        System.out.println("binary = " + binary);
        int octal = 0173;
        System.out.println("octal = " + octal);
        int hexa = 0x7B;
        System.out.println("hexa = " + hexa);

        int data = 123;
        String bina = java.lang.Integer.toBinaryString(data);
        System.out.println("bina = " + bina); // ob1111011
        String octa = java.lang.Integer.toOctalString(data);
        System.out.println("octa = " + octa); // 0173
        String hex = java.lang.Integer.toHexString(data);
        System.out.println("hex = " + hex); // 0x7B

        int x = 123;
        System.out.println("x = " + x);
        int y = 0b1111011;
        System.out.println("y = " + y);
        int z = 0173;
        System.out.println("z = " + z);
        int u = 0x7B;
        System.out.println("u = " + u);
    }
}
