package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula05.AtividadeHeranca.com.br.unit.Atividade01;

public class Main {
    public static void main(String[] args) {
        Fisica pf1 = new Fisica("Ana", "Rua dos Bobos", "(79)9999-9999", "111222333-11", "1111111", "15/05/2000");
        Fisica pf2 = new Fisica("Eric", "Rua Moacir", "(79)8888-8888", "999888777-99", "2222222", "05/03/2000");

        Juridica pj1 = new Juridica("Julia", "Rua Jose", "(79)7777-7777", "12345678912345", "333333333", "111");
        Juridica pj2 = new Juridica("Julia", "Rua Jose", "(79)7777-7777", "98765432198765", "444444444", "222");

        pf1.exibirDados();
        pf2.exibirDados();
        pj1.exibirDados();
        pj2.exibirDados();
    }
}
