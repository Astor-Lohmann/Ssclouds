import java.util.Scanner;

public class PrimosRecursiva {

    public static int checarPrimo(int i, int num) {
        if (num == i)
            return 0;
        else if (num % i == 0)
            return 1;
        else {
            return checarPrimo(i + 1, num);
        }
    }


    public static void main(String arg[]) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor : ");
        n = scanner.nextInt();

        if (n < 0)
            System.out.println("Valor Inválido");
        else
            System.out.print("Estes são os numeros primos até o " + n + ": ");
        for (int i = 2; i <= n; i++)
            if (checarPrimo(2, i) == 0)
                System.out.print(i + " ");

    }
}



