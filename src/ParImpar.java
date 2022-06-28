import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numero;
        double contador = 0;
        double numero2;
        double impar = 0;
        double par = 0;

        System.out.printf("Quantos numeros: ");
        numero2 = teclado.nextDouble();

        do {
            ++contador;

            System.out.printf("Informe o numero: ");
            numero = teclado.nextDouble();

            if (numero % 2 == 0) {
                ++par;

            }else if (!(numero % 2 == 0)) {
                ++impar;
                
            }else{
                System.out.printf("Ocorreu algum erro: ");
            }

        } while (contador < numero2);

        System.out.println("Numeros impar: " + impar);
        System.out.println("Numeros par: " + par);
        
    }
}
