package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula05.AtividadeHeranca.br.com.unit.Atividade02;

public class Cd extends Midia {
    private int nMusicas;

    public Cd() {}

    public Cd(int codigo, double preco, String nome, int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + "\nNúmero de Músicas: " + nMusicas;
    }

    @Override
    public void printDados() {
        super.printDados();
    }

    @Override
    public void inserirDados(int codigo, double preco, String nome) {
        super.inserirDados(codigo, preco, nome);
    }

    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }
}

