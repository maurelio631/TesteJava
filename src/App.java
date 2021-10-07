import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        int soma;
        System.out.println("Seja bem-vindo à sua calculadora");
        System.out.println("Insira o primeiro número da soma: ");
        num1 = entrada.nextInt();
        System.out.println("Insira o segundo número da soma: ");
        num2 = entrada.nextInt();
        soma = num1 + num2;
        System.out.println("O resultado da soma é: "+soma);
    }
}
