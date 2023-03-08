import java.util.Scanner;

public class FormatadorDeDatas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("==========FORMATADOR DE DATAS==========\n\n");

        System.out.print("Informe uma data (DD-MM-AAAA): ");
        String data = entrada.nextLine();

        String[] formatadorDeDatas = data.split("-");

        String mes = "";

        switch (formatadorDeDatas [1]) {
            case "01": mes = "janeiro";
            break;
            case "02": mes = "fevereiro";
                break;
            case "03": mes = "março";
                break;
            case "04": mes = "abril";
                break;
            case "05": mes = "maio";
                break;
            case "06": mes = "junho";
                break;
            case "07": mes = "julho";
                break;
            case "08": mes = "agosto";
                break;
            case "09": mes = "setembro";
                break;
            case "10": mes = "outrubro";
                break;
            case "11": mes = "novembro";
                break;
            case "12": mes = "dezembro";
                break;
            default:
                throw new IllegalStateException("Valor inválido: " + formatadorDeDatas[1]);
        }
        System.out.print("Dia " + formatadorDeDatas[0] + " de " + mes + " de " + formatadorDeDatas[2]);
    }
}