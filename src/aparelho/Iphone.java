package aparelho;

import internet.NavegadorInternet;
import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba em Iphone");
    }

    public void exibirPagina() {
        System.out.println("Exibindo nova página em Iphone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página em Iphone");
    }

    public void pausarMusica() {
        System.out.println("Pausando música em Iphone");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música em Iphone");
    }

    public void tocarMusica() {
        System.out.println("Tocando música em Iphone");
    }

    public void atender() {
        System.out.println("Atendendo Iphone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz em Iphone");
    }

    public void ligar() {
        System.out.println("Ligando em Iphone");
    }

}
