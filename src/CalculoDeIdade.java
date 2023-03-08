import java.util.Scanner;

public class CalculoDeIdade {

    public static final int ANO_ATUAL = 2023;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        imprimir("Informe o ano de seu nascimento: ");
        int anoNascimento = Integer.parseInt(entrada.nextLine());

        int idade = calcular(anoNascimento);
        imprimir("Você tem " + idade + " anos de idade.\n");

        boolean maiorIdade = verificarMaiorIdade(idade);
        if (maiorIdade){
            imprimir("Acesso liberado.");
        } else {
            imprimir("Acesso negado.");
        }
        }
    static int calcular(int anoNascimento) {
        int idade = ANO_ATUAL - anoNascimento;
        return idade;
    }
    static void imprimir(String msg) {
        System.out.print(msg);
    }
    static boolean verificarMaiorIdade(int idade){
        if (idade >= 18) {
            return true;
        } else {
            return false;
        }
    }
}