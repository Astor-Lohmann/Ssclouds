import java.util.Scanner;

public class PrimosLinear {

    public static void main(String arg[]) {
        int i, n, contador, j;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor : ");
        n = scanner.nextInt();

        if (n < 0)
            System.out.println("Valor Inválido");
        else
            System.out.print("Estes são os numeros primos até o " + n + ": ");

        for (j = 2; j <= n; j++) {

            contador = 0;
            for (i = 1; i <= j; i++) {
                if (j % i == 0) {
                    contador++;
                }
            }
            if (contador == 2)
                System.out.print(j + " ");
        }
    }


}
