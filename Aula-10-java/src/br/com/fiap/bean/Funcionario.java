package br.com.fiap.bean;

public class Funcionario {
    //atributos
    private String nome;
    private float valorHoraTrabalho;
    // construtores (Alt+Insert)
    public Funcionario(){

    }
    public Funcionario(String nome, float valorHoraTrabalho) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
    }

    //metodos getters/setters (Alt + Insert)

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }

    public void setValorHoraTrabalho(float valorHoraTrabalho) {
        try{
            if(valorHoraTrabalho > 0){
                this.valorHoraTrabalho = valorHoraTrabalho;
            }else{
                throw new Exception("Valor não pode ser 0");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //metodos da classe
    public float calcularSalario(float qtdeHorasTrabalhadasSemana){
        return valorHoraTrabalho * qtdeHorasTrabalhadasSemana * 4;
    }
}
