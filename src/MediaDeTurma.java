import java.util.Scanner;

public class MediaDeTurma {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("==========CALCULAR A MÉDIA DA TURMA==========\n");

        System.out.print("Informe a quantidade de alunos na sala: ");
        int qtdeAlunos = Integer.parseInt(entrada.nextLine());

        double media = 0;
        double soma = 0;

        for (int i = 1; i <= qtdeAlunos; i++) {

            System.out.printf("Informe a nota do aluno %s: ", i);
            double nota = Double.parseDouble(entrada.nextLine());

            soma = soma + nota;
        }
        media = soma / qtdeAlunos;
        System.out.print("Media da turma: " + media);
    }
}