package smartphone;

import smartphone.app.AparelhoTelefonico;
import smartphone.app.IPhone;
import smartphone.app.NavegadorInternet;
import smartphone.app.ReproducaoMusical;

import java.util.Scanner;

public class AppIPhone {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        IPhone iPhone = null;

        System.out.println("Escolha am função: ");
        String sevicosEscolhido = scanner.nextLine();

        iPhone = switch (sevicosEscolhido) {
            case "ap" -> new AparelhoTelefonico();
            case "nv" -> new NavegadorInternet();
            case "rm" -> new ReproducaoMusical();
            default -> iPhone;
        };

        iPhone.ligar();
        iPhone.exibirPagina();
        iPhone.tocarMusica();

        scanner.close();

    }
}
