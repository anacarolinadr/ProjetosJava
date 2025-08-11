package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade07;

import java.util.Arrays;

public class Anagrama {
    private String palavra1;
    private String palavra2;

    public Anagrama(String palavra1, String palavra2) {
        this.palavra1 = palavra1.toLowerCase();
        this.palavra2 = palavra2.toLowerCase();
    }

    public boolean isAnagrama() {
        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        char[] letras1 = palavra1.toCharArray();
        char[] letras2 = palavra2.toCharArray();

        Arrays.sort(letras1);
        Arrays.sort(letras2);
        return Arrays.equals(letras1, letras2);
    }
}
