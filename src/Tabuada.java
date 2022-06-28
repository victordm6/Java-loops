import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int multiplica;

        System.out.print("Informe a Tabuada: ");
        numero = teclado.nextInt();
        System.out.println("Tabuada do " + numero);

        for (int index = 1; index <= 10; index++) {
            multiplica = numero * index;

            System.out.println(numero + " x " + index + " = " + multiplica);
            
        }
    }
}
