import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int multiplica = 1;
        int fatorial;

        System.out.print("Informe um  número inteiro: ");
        numero = teclado.nextInt();
        System.out.print(numero + "! = ");
        System.out.print(numero);
        fatorial = numero;

        for (int index = 1; index < numero; index++) {
            
            multiplica *= fatorial;
            --fatorial;
            System.out.print("." + fatorial);
        }
        System.out.print(" = " + multiplica);
    }
}
