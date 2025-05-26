package ProjetosPOO.DesafioGestaoEscolar;

public class Professor extends Pessoa{
    private String materia;

    public Professor(String nome, int idade, String materia) {
        super(nome, idade);
        this.materia = materia;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Materia: " + materia);
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
