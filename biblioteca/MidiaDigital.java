package biblioteca;

public class MidiaDigital extends ItemBiblioteca {
    private String formatoArquivo;

    public MidiaDigital(String titulo, String autor, int anoPublicacao, String formatoArquivo) {
        super(titulo, autor, anoPublicacao);
        this.formatoArquivo = formatoArquivo;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("---[ Detalhes da Mídia Digital ]---");
        super.exibirInformacoes();
        System.out.println("Formato do Arquivo: " + formatoArquivo);
    }

    // Método exclusivo da classe MidiaDigital
    public void reproduzir() {
        System.out.println("Reproduzindo o audiolivro '" + titulo + "' (formato " + formatoArquivo + ")...");
    }
}