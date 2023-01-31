import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros no total? ");

        int n = sc.nextInt();
        int[] vet = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextInt();

        }

        System.out.println("Numeros negativos: ");
        for(int i=0;i<n;i++) {
            if (vet[i]<0){
                System.out.println(vet[i]);
            }
        }

        sc.close();
    }


}