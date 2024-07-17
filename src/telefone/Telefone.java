package telefone;

public class Telefone implements AparelhoTelefonico {

    public void atender() {
        System.out.println("Atendendo telefone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz em telefone");
    }

    public void ligar() {
        System.out.println("Ligando em telefone");
    }
}
