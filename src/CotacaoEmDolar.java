import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CotacaoEmDolar {

    public static void main(String[] args) {

        boolean repeticao = false;

        do {
            Scanner entrada = new Scanner(System.in);

            System.out.println("==========CONVERSÃO DE REAIS (R$) EM DÓLARES (US$)==========");

            System.out.print("Informe a cotação atual do Dólar (US$): ");
            BigDecimal dolar = new BigDecimal(entrada.nextLine());

            System.out.print("Informe o valor em Reais (R$) que deseja converter em Dólares (US$): ");
            BigDecimal reais = new BigDecimal(entrada.nextLine());

            BigDecimal conversao = reais.divide(dolar, 4, RoundingMode.DOWN);
            System.out.printf("O valor informado em Reais (R$) convertido em Dólares (US$) é de: US$%.2f", conversao);

            System.out.println("\nDeseja realizar outra conversão?\nS - Sim\nN - Não");
            String resposta = entrada.nextLine();
            if (resposta.equalsIgnoreCase("s")){
                repeticao = true;
            } else if (resposta.equalsIgnoreCase("n")){
                repeticao = false;
            } else {
                System.out.println("Opção inválida. Fim da execução.");
            }
        } while (repeticao);
        System.out.println("Fim da execução!");
    }
}