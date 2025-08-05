package ProjetosUNIT.DesafiosAula02.Atividade06;

public class Pessoa {
    public String nome;
    public int idade;
    public double altura;
    public int peso;

    public Pessoa(String nome, int idade, double altura, int peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public double calcularIMC(){
        double imc = peso / (altura * altura);
        return imc;
    }

    public void exibirClassificacao(){
        double imc = calcularIMC();
        if (imc < 18.5) {
            System.out.println(this.nome + " está abaixo do peso");
        } else if (imc > 18.5 && imc < 24.9) {
            System.out.println(this.nome + " está com peso normal");
        } else if (imc > 24.9 && imc < 29.9) {
            System.out.println(this.nome + " está com sobrepeso");
        } else if (imc > 30 && imc < 34.9) {
            System.out.println(this.nome + " está com obesidade grau I");
        } else if (imc > 35 && imc < 39.9) {
            System.out.println(this.nome + " está com obesidade grau II");
        } else if (imc > 40) {
            System.out.println(this.nome + " está com obesidade grau III");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
