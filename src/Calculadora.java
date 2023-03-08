import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double valor1 = Double.parseDouble(entrada.nextLine());

        System.out.print("Digite o segundo número: ");
        double valor2 = Double.parseDouble(entrada.nextLine());

        System.out.println("Escolha uma operação: \n1 = Soma\n2 = Subtracao\n3 = Multiplicação\n4 = Divisão");
        int operacao = entrada.nextInt();

        double resultado;

        if (operacao == 1) {
            resultado = valor1 + valor2;
            System.out.printf("O resultado da soma é: %.2f", resultado);
        } else if (operacao == 2) {
            resultado = valor1 - valor2;
            System.out.printf("O resultado da subtração é: %.2f", resultado);
        } else if (operacao == 3) {
            resultado = valor1 * valor2;
            System.out.printf("O resultado da multiplicação é: %.2f", resultado);
        } else if (operacao == 4) {
            resultado = valor1 / valor2;
            System.out.printf("O resultado da divisão é: %.2f", resultado);
        } else {
            System.out.println("Por favor, informe uma opção válida.");
        }
    }
}
