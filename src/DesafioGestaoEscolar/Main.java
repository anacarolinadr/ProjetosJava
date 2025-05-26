package DesafioGestaoEscolar;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Julia", 13,9.5, 1500);
        Professor professor = new Professor("Arilson", 64, "Matemática");
        Funcionario funcionario = new Funcionario("Beto", 19, "Monitor");

        aluno.exibirInformacoes();
        professor.exibirInformacoes();
        funcionario.exibirInformacoes();
    }
}
