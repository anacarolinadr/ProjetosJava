package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade09;

public class FraseInvertida {
    public String frase;

    public FraseInvertida(String frase) {
        this.frase = frase;
    }

    public String inverterFrase(){
        String [] palavras = frase.split(" ");
        StringBuilder fraseInvertida = new StringBuilder();

        for (int i = palavras.length - 1; i >=0; i--) {
            fraseInvertida.append(palavras[i]);
            if (i != 0) {
                fraseInvertida.append(" ");
            }
        }

        return fraseInvertida.toString();

    }
}
