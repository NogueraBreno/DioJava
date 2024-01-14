public class Iphone implements  ReprodutorMusical, AparelhoTelefonico , NavegadorInternet {
    @Override
    public void ligar() {
        System.out.println("Aparelho ligado");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar Correio de Voz.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Abrir Página.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba aberta.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada.");
    }

    @Override
    public void tocar() {
        System.out.println(" Tocar musica.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar musica.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada.");
    }
}
