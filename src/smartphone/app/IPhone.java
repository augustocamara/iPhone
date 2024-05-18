package smartphone.app;
// Herança ou Seja class Pai
// Abstração essa Class não tem corpo ela só espera as informações da classe filho.
public abstract class IPhone {

    public abstract void tocarMusica();
    public abstract void exibirPagina();
    public abstract void ligar();
    public void iniciar() {
        System.out.println("Iniciando iPhone...");
    }
    protected void iniciarCorreioVoz() {

    }
}
