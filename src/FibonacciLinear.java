import java.util.Scanner;

public class FibonacciLinear {

    public static int fibonacci(int n) {
        int previous = 0;
        int current = 1;
        int next;

        if (n == 0) return 0;
        else {
            for (int z = 1; z<n; z++){
                next = current + previous;
                previous = current;
                current = next;
            }
            return current;
        }
    }

    public static void main(String arg[]) {



        int i, n, contador, j;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor : ");
        n = scanner.nextInt();

        if (n < 0)
            System.out.println("Valor Inválido");
        else
            System.out.println("Numero correspondente  na sequência de fibonacci: " + fibonacci(n));
    }
}
