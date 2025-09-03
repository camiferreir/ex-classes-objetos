package estudante;

public class Estudante {

    public static void main(String[] args) {
        Estudante e1 = new Estudante();
        e1.nome = "Camille";
        e1.idade = 20;

        e1.adicionarDisciplina("Matemática");
        e1.adicionarDisciplina("Programação");
        e1.adicionarDisciplina("Banco de Dados");

        e1.exibirDisciplinas();
    }
    private String nome;
    private int idade;

    private void adicionarDisciplina(String matemática) {

    }

    private void exibirDisciplinas() {

    }

}
