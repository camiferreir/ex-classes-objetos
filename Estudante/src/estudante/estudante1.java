package estudante;

import java.util.ArrayList;

public class estudante1 {

    String nome;
    int idade;
    ArrayList<String> disciplinas = new ArrayList<>();

    void adicionarDisciplina(String disciplina) {
        disciplinas.add(disciplina);
        System.out.println("Disciplina '" + disciplina + "' adicionada.");
    }

    void exibirDisciplinas() {
        System.out.println("Disciplinas de " + nome + ": " + disciplinas);
    }
}
