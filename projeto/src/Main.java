/**
 * Classe para testar as saídas.
 */
public class Main {

  public static void main(String[] args) {
    AparelhoMultiuso aparelho = new AparelhoMultiuso();

    aparelho.selecionarMusica("Musica");
    aparelho.tocar();
    aparelho.pausar();

    aparelho.atender();
    aparelho.iniciarCorreioVoz();
    aparelho.ligar(88888888);

    aparelho.exibirPagina();
    aparelho.atualizarPagina();
    aparelho.adicionarNovaAba();
  }

}
