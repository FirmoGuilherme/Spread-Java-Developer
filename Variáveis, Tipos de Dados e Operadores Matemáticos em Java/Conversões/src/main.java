public class main {
    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; // explicito

        long l1;
        int i1 = 10;
        l1 = 11; // implicito

        System.out.println(b1);
        System.out.println(l1);
    }
}
