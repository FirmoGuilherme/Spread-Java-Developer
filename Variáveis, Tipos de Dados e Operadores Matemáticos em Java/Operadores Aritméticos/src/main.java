public class main {
    public static void main(String[] args) {
        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmético");
        aritimetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();
    }

    private static void prePos(){
      int k = 10;

      int i = ++k;
      int j = k--;
      int x = k;

        System.out.println("i: " +  i);
        System.out.println("j: " +  j);
        System.out.println("x: " +  x);
    }
    private static void aritimetico(){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("a+b = " + r1);
        System.out.println("c-a = " + r2);
        System.out.println("d*b = " + r3);
        System.out.println("e/a= " + r4);
        System.out.println("c%b = " + r5);
    }
    private static void atribuicao(){
        int i = 1000;
        int j =15;
        int k= 500;
        int l = 35;
        double m = 3.5;
        double n = m;

        System.out.println("n: " + n);

        i += 5; // i = i - 5
        j -= 3; // j = j - 3
        n /= 2.7; // n = n / 2.7
        k *= 3; // k = k * 3
        l %= 2; // l = l % 2

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("n: " + n);
        System.out.println("k: " + k);
        System.out.println("l: " + l);

        i = k = j;

        System.out.println("k: " + k);
        System.out.println("i: " + i);


    }
    private static void precedencia(){
        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k; // 10 + 19 * 30 -> 10 + 570 -> 580

        System.out.println("i++ + --j * k: " + a);

        System.out.println("i: " + i); // 11

        int b = k/ --i % 3 + 1; // 30 / 10 % 3 + 1 -> 1  // OBS.: O "i" era 11 e na expressao ele diminuiu

        System.out.println("k/ --i % 3 + 1: " + b);

        System.out.println("i: " + i); // 10

        int c = 2;
        c *= i += 5; // c = 2 * i; i = i + 5 -> c = 2 * i; i = 10 + 5; c = 2 * 15; ; -> c = 2 * 15; c = 30

        System.out.println("c *= i += 5: " + c);
    }
}
