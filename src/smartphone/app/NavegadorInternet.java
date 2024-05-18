package smartphone.app;
// Class Filho herdaram as informações da classe Pai
// Abstração ->  A class Filho informará como ele enviará as informações para a classe Pai Ex. Como ele "Exibi pag. na intenet"

public class NavegadorInternet extends IPhone{

    @Override
    public void tocarMusica() {
    }
    public void exibirPagina() {
        iniciar();
        System.out.println("Exibindo página: {url}");
        abrirNovaAba();
        atualizarPagina();
    }
    @Override
    public void ligar() {
    }
    private void abrirNovaAba() {
        System.out.println("Abrindo nova aba...");
    }
    private void atualizarPagina() {
        System.out.println("Atualizando página...\n");
    }
    public void iniciar() {
        System.out.println("Iniciando iPhone...");

    }
}
