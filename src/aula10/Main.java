package aula10;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Felipe");
        p2.setNome("Carlos");
        p3.setNome("Mateus");
        p4.setNome("Lucas");

        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);

        p3.receberAumento(550.20);
        p4.mudarTrabalho();
        p2.cancelarMatricula();

        p2.setCurso("Informática");
        p3.setSalario(2500.75);
        p4.setSetor("Estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
