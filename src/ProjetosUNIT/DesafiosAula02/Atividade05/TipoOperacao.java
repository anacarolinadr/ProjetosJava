package ProjetosUNIT.DesafiosAula02.Atividade05;

public enum TipoOperacao {
    SOMA("Soma", "+", 1),
    SUBTRACAO("Subtração", "-", 2),
    MULTIPLICACAO("Multiplicação", "*", 3),
    DIVISAO("Divisão", "/", 4);

    private String nome;
    private String simbolo;
    private int codigo;

    TipoOperacao(String nome, String simbolo, int codigo) {
        this.nome = nome;
        this.simbolo = simbolo;
        this.codigo = codigo;
    }

    public static TipoOperacao buscarPorCodigo(int codigo) {
        for (TipoOperacao operacao : values()) {
            if (operacao.getCodigo() == codigo) {
                return operacao;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
