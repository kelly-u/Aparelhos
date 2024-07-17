package estabelecimento;

import aparelho.Iphone;
import internet.NavegadorInternet;
import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Fabrica {
    public static void main(String[] args) {
        
        Iphone i = new Iphone();
        NavegadorInternet navegador = i;
        ReprodutorMusical reprodutor = i;
        AparelhoTelefonico aparelho = i;

       navegador.adicionarNovaAba();
       navegador.atualizarPagina();
       navegador.exibirPagina(); 

       reprodutor.selecionarMusica();
       reprodutor.tocarMusica();
       reprodutor.pausarMusica();

        aparelho.ligar();
        aparelho.iniciarCorreioVoz();
        aparelho.atender();

    }

}
