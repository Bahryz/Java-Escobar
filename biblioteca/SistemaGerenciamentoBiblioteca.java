package biblioteca;

public class SistemaGerenciamentoBiblioteca {
    public static void main(String[] args) {
        ItemBiblioteca livro = new Livro("Dom Casmurro", "Machado de Assis", 1899, "Romance Realista");
        ItemBiblioteca revista = new Revista("Veja", "Editora Abril", 2023, 2855);
        ItemBiblioteca midia = new MidiaDigital("O Auto da Compadecida (Audiolivro)", "Ariano Suassuna", 2005, "MP3");

        System.out.println("==========================================================");
        System.out.println("  DEMONSTRAÇÃO DE POLIMORFISMO E OPERAÇÕES DA BIBLIOTECA");
        System.out.println("==========================================================\n");

        ItemBiblioteca[] acervo = {livro, revista, midia};

        for (ItemBiblioteca item : acervo) {
            item.exibirInformacoes(); 
            item.emprestar();
            item.emprestar(); 
            item.devolver();
            System.out.println("\n------------------------------------------------------\n");
        }

        System.out.println("==========================================================");
        System.out.println("         DEMONSTRAÇÃO DE COMPORTAMENTOS ÚNICOS");
        System.out.println("==========================================================\n");

        if (livro instanceof Livro) {
            ((Livro) livro).lerAmostra();
        }

        if (revista instanceof Revista) {
            ((Revista) revista).folhearPaginas();
        }

        if (midia instanceof MidiaDigital) {
            ((MidiaDigital) midia).reproduzir();
        }
    }
}
