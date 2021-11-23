public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {0,15,50,62,60,4};

        int count = 0;

        while (count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.println();
        for (int i = (vetor.length-1); i >= 0; i--){ // inverso
            System.out.print(vetor[i] + " ");
        }
    }
}
