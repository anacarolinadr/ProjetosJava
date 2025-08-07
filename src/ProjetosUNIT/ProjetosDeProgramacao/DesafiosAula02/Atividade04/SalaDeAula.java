package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade04;

public class SalaDeAula {
    public Aluno alunos [];

    public SalaDeAula(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void exibirDetalhes(){
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno "+  alunos[i].getNome() + " teve a média " + alunos[i].calcularMedia());
            System.out.println("Foi: " + alunos[i].calcularAprovacao());
        }
    }
}
