package device;

import features.browser.Navegador;
import features.music.ReprodutorMusical;
import features.phone.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, Navegador {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina...");
    }

    @Override
    public void addNovaPagina() {
        System.out.println("Adicionando nova pagina...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica...");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
