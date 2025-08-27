package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula05.AtividadeHeranca.br.com.unit.Atividade02;

public class Main {
    public static void main(String[] args) {
        Dvd dvd = new Dvd(1, 29.90, "Filme Pinguins dos Papai", 12);
        Cd cd = new Cd(2, 19.90, "Album TTPD", 10);

        dvd.printDados();
        System.out.println();
        cd.printDados();
    }
}

