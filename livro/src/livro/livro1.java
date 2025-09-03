package livro;

public class livro1 {

    String titulo;
    String autor;
    int paginas;
    int exemplares;

    void emprestar() {
        if (exemplares > 0) {
            exemplares--;
            System.out.println("Livro '" + titulo + "' emprestado. Restam " + exemplares + " exemplares.");
        } else {
            System.out.println("Nenhum exemplar disponível.");
        }
    }

    void devolver() {
        exemplares++;
        System.out.println("Livro '" + titulo + "' devolvido. Agora há " + exemplares + " exemplares.");
    }

}
