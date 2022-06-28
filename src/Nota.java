import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int nota;
        System.out.printf("Informe a sua Nota: ");
        nota = teclado.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Valor invalido digite um numero entre 0 a 10");
            System.out.printf("Informe a sua Nota: ");
            nota = teclado.nextInt();
        }
        
        System.out.print("Sua nota: " + nota);
    }
}

