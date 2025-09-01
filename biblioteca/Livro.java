package biblioteca;

public class Livro extends ItemBiblioteca {
    private String genero;

    public Livro(String titulo, String autor, int anoPublicacao, String genero) {
        super(titulo, autor, anoPublicacao);
        this.genero = genero;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("---[ Detalhes do Livro ]---");
        super.exibirInformacoes();
        System.out.println("Gênero: " + genero);
    }

    public void lerAmostra() {
        System.out.println("Lendo as primeiras páginas do clássico '" + titulo + "'...");
    }
}