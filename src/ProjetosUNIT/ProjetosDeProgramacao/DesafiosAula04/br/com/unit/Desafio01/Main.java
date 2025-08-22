package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Desafio01;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Plataforma educaPlus = new Plataforma("EducaPlus");

        System.out.println("EducaPlus");

        Instrutor instrutor1 = educaPlus.cadastrarInstrutor("Ana Passos", "12345678901", "15/05/1980");
        Instrutor instrutor2 = educaPlus.cadastrarInstrutor("Eric Mariano", "98765432101", "05/03/1985");
        Instrutor instrutor3 = educaPlus.cadastrarInstrutor("Juliana Ivo", "33333333333", "29/06/1978");

        System.out.println();

        Aluno aluno1 = educaPlus.cadastrarAluno("Layze Santos", "11111111111", "20/08/1995");
        Aluno aluno2 = educaPlus.cadastrarAluno("Bruno Barreto", "22222222222", "10/03/1992");
        Aluno aluno3 = educaPlus.cadastrarAluno("Davi Thiesse", "44444444444", "05/12/1998");
        Aluno aluno4 = educaPlus.cadastrarAluno("Victor Flavio", "55555555555", "18/07/1990");

        System.out.println();

        System.out.println("Teste para Geração de Novas Matrículas");
        String novaMatriculaAluno = educaPlus.gerarMatriculaAluno();
        String novaMatriculaInstrutor = educaPlus.gerarMatriculaInstrutor();

        System.out.println("Próxima matrícula de aluno disponível: " + novaMatriculaAluno);
        System.out.println("Próxima matrícula de instrutor disponível: " + novaMatriculaInstrutor);

        System.out.println();

        Curso cursoJava = new Curso("Java Fundamentals", "Aprenda Java do básico ao avançado",
                instrutor1, NivelDificuldade.MEDIO, 299.90, Status.ATIVO);

        Curso cursoPython = new Curso("Python para Iniciantes", "Introdução completa ao Python",
                instrutor2, NivelDificuldade.FACIL, 199.90, Status.ATIVO);

        Curso cursoJavaScript = new Curso("JavaScript Moderno", "Aprenda JS ES6+ e frameworks",
                instrutor3, NivelDificuldade.DIFICIL, 399.90, Status.ATIVO);

        Curso cursoInativo = new Curso("Curso Descontinuado", "Este curso não está mais disponível",
                instrutor1, NivelDificuldade.MEDIO, 199.90, Status.INATIVO);

        instrutor1.criarCurso(cursoJava);
        instrutor1.criarCurso(cursoInativo);
        instrutor2.criarCurso(cursoPython);
        instrutor3.criarCurso(cursoJavaScript);

        educaPlus.getCursos().add(cursoJava);
        educaPlus.getCursos().add(cursoPython);
        educaPlus.getCursos().add(cursoJavaScript);
        educaPlus.getCursos().add(cursoInativo);

        Conteudo conteudo1 = new Conteudo("Introdução ao Java", cursoJava);
        Conteudo conteudo2 = new Conteudo("Variáveis e Tipos de Dados", cursoJava);
        Conteudo conteudo3 = new Conteudo("Estruturas de Controle", cursoJava);

        Conteudo conteudo4 = new Conteudo("Introdução ao Python", cursoPython);
        Conteudo conteudo5 = new Conteudo("Sintaxe Básica Python", cursoPython);

        instrutor1.gerenciarConteudo(conteudo1, cursoJava);
        instrutor1.gerenciarConteudo(conteudo2, cursoJava);
        instrutor1.gerenciarConteudo(conteudo3, cursoJava);

        instrutor2.gerenciarConteudo(conteudo4, cursoPython);
        instrutor2.gerenciarConteudo(conteudo5, cursoPython);

        System.out.println("Matrículas dos Alunos");
        educaPlus.matricularAluno(aluno1, cursoJava, FormaPagamento.PIX);
        educaPlus.matricularAluno(aluno2, cursoJava, FormaPagamento.CARTAO_CREDITO);
        educaPlus.matricularAluno(aluno3, cursoJava, FormaPagamento.BOLETO);
        educaPlus.matricularAluno(aluno4, cursoJava, FormaPagamento.CARTAO_DEBITO);
        educaPlus.matricularAluno(aluno1, cursoPython, FormaPagamento.BOLETO);
        educaPlus.matricularAluno(aluno2, cursoPython, FormaPagamento.PIX);
        educaPlus.matricularAluno(aluno4, cursoJavaScript, FormaPagamento.PIX);
        educaPlus.matricularAluno(aluno3, cursoInativo, FormaPagamento.PIX);
        educaPlus.matricularAluno(aluno1, cursoJava, FormaPagamento.CARTAO_CREDITO);

        System.out.println();

        System.out.println("Popularidade dos Cursos");
        cursoJava.medirPopularidade();
        cursoPython.medirPopularidade();
        cursoJavaScript.medirPopularidade();
        cursoInativo.medirPopularidade();

        System.out.println();

        System.out.println("Avaliação dos Alunos");
        Avaliacao avaliacao1 = new Avaliacao("Excelente curso de Java",
                "O curso superou minhas expectativas. Muito bem estruturado!", 9.5, cursoJava, aluno1);
        Avaliacao avaliacao2 = new Avaliacao("Bom curso",
                "Conteúdo bom, mas poderia ter mais exercícios práticos", 8.0, cursoJava, aluno2);
        Avaliacao avaliacao3 = new Avaliacao("Curso completo",
                "Aprendi muito com este curso de Java", 8.5, cursoJava, aluno3);
        Avaliacao avaliacao4 = new Avaliacao("Python fácil",
                "Curso muito didático para iniciantes", 9.0, cursoPython, aluno1);
        Avaliacao avaliacao5 = new Avaliacao("Recomendo",
                "Ótima introdução ao Python", 8.8, cursoPython, aluno2);

        aluno1.gerenciarAvaliacao(avaliacao1);
        aluno2.gerenciarAvaliacao(avaliacao2);
        aluno3.gerenciarAvaliacao(avaliacao3);
        aluno1.gerenciarAvaliacao(avaliacao4);
        aluno2.gerenciarAvaliacao(avaliacao5);
        Avaliacao avaliacaoInvalida = new Avaliacao("Tentativa inválida",
                "Esta avaliação não deveria funcionar", 7.0, cursoJavaScript, aluno3);
        aluno3.gerenciarAvaliacao(avaliacaoInvalida);

        System.out.println();

        System.out.println("Fim dos Cursos e Geração dos Certificados");
        Certificado certificado1 = new Certificado(cursoJava, aluno1,
                "Certificado de conclusão do curso Java Fundamentals para " + aluno1.getNome());
        Certificado certificado2 = new Certificado(cursoPython, aluno1,
                "Certificado de conclusão do curso Python para Iniciantes para " + aluno1.getNome());

        aluno1.finalizarCurso(cursoJava, certificado1);
        aluno1.finalizarCurso(cursoPython, certificado2);
        Certificado certificadoInvalido = new Certificado(cursoJavaScript, aluno3,
                "Este certificado não deveria ser gerado");
        aluno3.finalizarCurso(cursoJavaScript, certificadoInvalido);

        System.out.println();

        System.out.println("Relatorios Gerais");

        educaPlus.relatorioCursosMaisPopulares();
        System.out.println();

        educaPlus.relatorioInstrutoresMelhorAvaliados();
        System.out.println();

        educaPlus.relatorioFinanceiro(LocalDateTime.now().minusDays(30), LocalDateTime.now());
        System.out.println();

        educaPlus.relatorioGastoMedioAlunos();
        System.out.println();

        educaPlus.relatorioFormasPagamento();
    }
}