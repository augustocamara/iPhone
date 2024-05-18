package smartphone.app;

// Class Filho herdaram as informações da classe Pai
// Abstração ->  A class Filho informará como ele enviará as informações para a classe Pai Ex. Como ele "Ligar"
public class AparelhoTelefonico extends IPhone {
    @Override
    public void tocarMusica() {
    }
    @Override
    public void exibirPagina() {
    }
    public void ligar() {
        iniciar();
        System.out.println("Ligando para {numero}...");
        atenderChamada();
    }
    private void atenderChamada() {
        System.out.println("Atendendo chamada...\n");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

}

