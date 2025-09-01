package biblioteca;

public abstract class ItemBiblioteca implements Emprestavel {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;
    private boolean estaEmprestado;

    public ItemBiblioteca(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.estaEmprestado = false; 
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor/Editora: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Status: " + (estaEmprestado ? "Emprestado" : "Disponível"));
    }

    @Override
    public void emprestar() {
        if (!estaEmprestado) {
            this.estaEmprestado = true;
            System.out.println(">> O item '" + titulo + "' foi emprestado com sucesso.");
        } else {
            System.out.println(">> Ação negada: O item '" + titulo + "' já está emprestado.");
        }
    }

    @Override
    public void devolver() {
        if (estaEmprestado) {
            this.estaEmprestado = false;
            System.out.println(">> O item '" + titulo + "' foi devolvido com sucesso.");
        } else {
            System.out.println(">> Ação negada: O item '" + titulo + "' já se encontra na biblioteca.");
        }
    }
}