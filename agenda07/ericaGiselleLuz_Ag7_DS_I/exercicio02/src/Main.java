public class Main {
    public static void main(String[] args) {
        System.out.println("TABUADA DO 6 AO 10");

        for (int i = 6; i <= 10 ; i++) {
            System.out.println("**************************");
            System.out.println("Tabuada do " + i);
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }
    }
}