package smartphone.app;
// Class Filho herdaram as informações da classe Pai
// Abstração ->  A class Filho informará como ele enviará as informações para a classe Pai Ex. Como ele "Toca a Música"
public class ReproducaoMusical extends IPhone{
    public void tocarMusica() {
        iniciar();
        System.out.println("Tocando música...");
        selecionarMusica();
        pausarMusica();
    }
    @Override
    public void exibirPagina() {
    }
    @Override
    public void ligar() {
    }
    private void pausarMusica() {
        System.out.println("Pausando música...");
    }
    private void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

}