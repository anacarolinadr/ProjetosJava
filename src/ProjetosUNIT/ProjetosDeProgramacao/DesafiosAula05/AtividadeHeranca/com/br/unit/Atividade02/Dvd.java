package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula05.AtividadeHeranca.com.br.unit.Atividade02;

public class Dvd extends Midia {
    private int nFaixas;

    public Dvd() {}

    public Dvd(int codigo, double preco, String nome, int nFaixas) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + "\nNúmero de Faixas: " + nFaixas;
    }

    @Override
    public void printDados() {
        super.printDados();
    }

    @Override
    public void inserirDados(int codigo, double preco, String nome) {
        super.inserirDados(codigo, preco, nome);
    }

    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }
}

