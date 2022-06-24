import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int idade;
        String nome;
        int numero = 1;

        while (numero != 0) {
            
            System.out.printf("\nInforme o seu nome: ");
            nome = teclado.nextLine();
            teclado.nextLine();
            System.out.printf("Informe a sua idade: ");
            idade = teclado.nextInt();
            System.out.printf("Digite 0 para parar: ");
            numero = teclado.nextInt();
        }
        System.out.printf("\nTenha um otimo dia \n");
    }
}
