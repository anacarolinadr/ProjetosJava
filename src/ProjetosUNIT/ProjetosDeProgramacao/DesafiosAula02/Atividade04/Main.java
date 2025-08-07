//Escreva um programa em Java para receber o nome dos alunos de uma
//turma com suas respectivas 2 notas, em seguida calcular a média do
//aluno e apresentar ao final a média calculada e a situação de Aprovação
//do aluno.

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade04;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ana", new int[]{9, 6});
        Aluno aluno2 = new Aluno("Eric", new int[]{4, 7});
        Aluno aluno3 = new Aluno("Juliana", new int[]{8, 9});

        SalaDeAula salaDeAula = new SalaDeAula(new Aluno[]{aluno1, aluno2, aluno3});
        salaDeAula.exibirDetalhes();
    }
}
