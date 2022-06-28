import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double numero;
        double contador = 0;
        double total = 0;
        double maior = 0;

        do {
            ++contador;

            System.out.printf("Informe o numero: ");
            numero = teclado.nextDouble();

            if (maior < numero) maior = numero;

            total += numero;

        } while (contador < 5);

        System.out.println("Maior numero: " + maior);
        System.out.println("Media dos numeros: " + (total/contador));
    }
}
