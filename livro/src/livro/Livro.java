package livro;

public class Livro {

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.paginas = 300;
        livro1.exemplares = 2;

        livro1.emprestar();
        livro1.emprestar();
        livro1.emprestar();
        livro1.devolver();
    }
    private String titulo;
    private String autor;
    private int paginas;
    private int exemplares;

    private void emprestar() {
    }

    private void devolver() {

    }

}
