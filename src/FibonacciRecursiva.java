import java.util.Scanner;

public class FibonacciRecursiva {

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String arg[]) {



        int i, n, contador, j;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor : ");
        n = scanner.nextInt();

        if (n < 0)
            System.out.println("Valor Inválido");
        else
            System.out.println("Numero correspondente na sequência de fibonacci: " + fibonacci(n));
        }
    }

