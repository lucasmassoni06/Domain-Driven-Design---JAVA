package br.com.fiap.bean;

public class FolhaDePagamento {
    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontoINSS;
    public double valorPlanoDeSaude;

    public double calcularSalarioLiquido(){
         double INSS = salarioBruto * descontoINSS;
         double plano = (numeroDeDependentes + 1) * valorPlanoDeSaude;
         double salarioLiquido = salarioBruto - (INSS + plano);
         return salarioLiquido;
    }
}
