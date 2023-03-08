import java.util.Scanner;

public class VerificadorDeSenhas {
    public static void main(String[] args) {

        boolean repeticao = true;

        do {

            System.out.println("==========VERIFICADOR DE SENHAS==========\n");

            Scanner entrada = new Scanner(System.in);

            System.out.print("Informe a senha correta: ");
            int senha = Integer.parseInt(entrada.nextLine());

            if (senha == 1122334455) {
                repeticao = false;
            } else {
                System.out.println("Senha incorreta, tente novamente.\n");
            }
        } while (repeticao);
        System.out.println("Senha correta, bem-vindo!");
    }
}