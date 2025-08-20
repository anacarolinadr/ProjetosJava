//Crie a classe Funcionario com os atributos nome e cpf.
//
//Crie a classe Empresa com os atributos nome, cnpj, salario e uma
//referência a uma array de Funcionario, além de outros atributos que
//você julgar necessário.
//
//Criar na classe Empresa um método para adicionar funcionario, que
//recebe uma referência a Funcionario como argumento e guarda esse
//funcionário
//
//Criar uma classe MainEmpresa para instanciar Funcionario e adicionar
//os funcionarios dentro da empresa através do método adiciona.
//Observe que antes você vai precisar criar a array, pois inicialmente o
//atributo empregados da classe Empresa não referencia lugar nenhum
//(seu valor é null)
//
//Percorra o atributo empregados da sua instância da Empresa e
//imprima os salários de todos seus funcionários. Para fazer isso, você
//pode criar um método chamado imprimeEmpregados dentro da
//classe Empresa

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Atividade02;

public class MainEmpresa {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Ana", "AAA-AAA-AAA-AA");
        Funcionario func2 = new Funcionario("Eric", "BBB-BBB-BBB-BB");
        Funcionario func3 = new Funcionario("Juliana", "CCC-CCC-CCC-CC");

        ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Atividade02.Empresa empresa = new Empresa("Empresa A", "1234", 2500);
        empresa.adiconaFunc(func1);
        empresa.adiconaFunc(func2);
        empresa.adiconaFunc(func3);

        empresa.listarFuncs();
    }
}
