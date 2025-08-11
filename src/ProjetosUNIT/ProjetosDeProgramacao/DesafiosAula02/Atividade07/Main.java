package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade07;

public class Main {
    public static void main(String[] args) {
        BethStore bethStore = new BethStore();

        FuncionarioAssalariado f1 = new FuncionarioAssalariado("Ana", "123.456.789-10", "15/05/2000", 1, Cargo.ASSISTENTE);
        FuncionarioAssalariado f2 = new FuncionarioAssalariado("Eric", "111.222.333-44", "18/08/2001", 2, Cargo.SUPERVISOR);
        FuncionarioHorista f3 = new FuncionarioHorista("Julia", "555.666.777-88", "20/09/2010", 3, 200);
        FuncionarioHorista f4 = new FuncionarioHorista("Rose", "999.101.111-12", "05/05/2008", 4, 160);
        FuncionarioComissionado f5 = new FuncionarioComissionado("Andre", "131.141.151-16", "01/12/2000", 5, Departamento.CALCADOS, 7000);
        FuncionarioComissionado f6 = new FuncionarioComissionado("Joelma", "171.181.191-20", "14/09/2000", 6, Departamento.VESTUARIO, 10000);

        bethStore.contratarFuncionario(f1);
        bethStore.contratarFuncionario(f2);
        bethStore.contratarFuncionario(f3);
        bethStore.contratarFuncionario(f4);
        bethStore.contratarFuncionario(f5);
        bethStore.contratarFuncionario(f6);

        bethStore.listarFuncionarios();
        bethStore.calcularFolhaPagamentoTotal();
    }
}
