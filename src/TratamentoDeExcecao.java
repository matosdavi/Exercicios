import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TratamentoDeExcecao {

    public static void main(String[] args) {

        try {
            imprime("=====DIVIDR UM NÚMERO=====\n");

            Scanner entrada = new Scanner(System.in);

            imprime("Digite o primeiro valor: ");
            BigDecimal valor1 = new BigDecimal(entrada.nextLine());

            imprime("Digite o segundo valor: ");
            BigDecimal valor2 = new BigDecimal(entrada.nextLine());

            BigDecimal resultado = valor1.divide(valor2, 10, RoundingMode.CEILING);
            resultado = resultado.setScale(2, RoundingMode.HALF_EVEN);
            System.out.printf("O resultado da divisão é: %.2f\n", resultado);

        } catch (NumberFormatException e) {
            imprime("Aconteceu um erro: " + "\"" + e.getMessage() + "\"." + " Por favor, digite apenas valores numéricos.\n");
            main(args);
        } catch (ArithmeticException e) {
            imprime("Aconteceu um erro: " + "\"" + e.getMessage() + "\"." + " Por favor, digite outro valor que não seja 0 para dividir.\n");
            main(args);
        } catch (Exception e) {
            imprime("Aconteceu um erro: " + "\"" + e.getMessage() + "\".\n");
            main(args);
        } finally {
            imprime("Fim da execução.");
        }
    }
    static void imprime(String msg) {
        System.out.print(msg);
    }
}