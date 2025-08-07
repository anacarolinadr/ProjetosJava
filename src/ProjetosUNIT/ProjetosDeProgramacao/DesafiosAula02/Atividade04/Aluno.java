package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade04;

public class Aluno {
    public String nome;
    public int [] notas;

    public Aluno(String nome, int[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public int calcularMedia(){
        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        int media = soma / notas.length;
        return media;
    }

    public String calcularAprovacao(){
        String resultado = calcularMedia() >= 6 ? "Aprovado" : "Reprovado";
        return resultado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
}
