package biblioteca;

public class Revista extends ItemBiblioteca {
    private int numeroEdicao;

    public Revista(String titulo, String autor, int anoPublicacao, int numeroEdicao) {
        super(titulo, autor, anoPublicacao); // "Autor" aqui pode ser a editora
        this.numeroEdicao = numeroEdicao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("---[ Detalhes da Revista ]---");
        super.exibirInformacoes();
        System.out.println("Número da Edição: " + numeroEdicao);
    }

    public void folhearPaginas() {
        System.out.println("Folheando a matéria de capa da revista '" + titulo + "'...");
    }
}