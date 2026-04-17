package Aula3;

public class Professor extends Pessoa {
    private Double salario;
    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Professor(String nome, int idade, double altura, String disciplina){
        super(nome, idade, altura);
        this.salario = salario;
        this.disciplina = disciplina;

    }

    public void aumentarSalario(double valor) {
        this.salario = salario + valor;
        System.out.println("Salario aumentado em " + valor);


    }

}
