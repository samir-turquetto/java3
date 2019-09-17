package br.com.caelum.vraptor.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FolhaPagamento {

    private Pessoa funcionario;

    private Double salarioLiquido;

    private Double salarioBruto;

    private LocalDateTime dtHoraPagamento;

    private int diasTrabalhados;

    private Double INSS;

    private Double FGTS;

    private Double Desconto;

    public Pessoa getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Pessoa funcionario) {
        this.funcionario = funcionario;
    }

    public Double getSalarioBruto() {
        return salarioLiquido;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioLiquido = salarioBruto;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salario) {
        this.salarioLiquido = salario;
    }

    public LocalDateTime getDtHoraPagamento() {
        return dtHoraPagamento;
    }

    public void setDtHoraPagamento(LocalDateTime dtHoraPagamento) {
        this.dtHoraPagamento = dtHoraPagamento;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public double getINSS() {
        return INSS;
    }

    public void setINSS(Double INSS) {
        this.INSS = INSS;
    }

    public double getFGTS() {
        return FGTS;
    }

    public void setFGTS(Double FGTS) {
        this.FGTS = FGTS;
    }

    public double getDesconto() {
        return Desconto;
    }

    public void setDesconto(Double Desconto) {
        this.Desconto = Desconto;
    }

}
