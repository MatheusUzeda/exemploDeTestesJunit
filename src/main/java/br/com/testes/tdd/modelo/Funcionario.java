package br.com.testes.tdd.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {
	//Atributos de um funcionario
	private String nome;
	private LocalDate dataAdmissao;
	private BigDecimal salario;

	//Construtor obrigatorio na criacao de um funcionario
	public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public BigDecimal getSalario() {
		return salario;
	}
//metodo responsavel por reajustar o salario do funcionario
//ele recebe um percentual, esse percentual e multiplicado pelo salario no metodo calcularValorDoAumento
//esse valor e guardado na variavel aumento e depois esse valor e adicionado ao salario	
	public void reajustarSalario(BigDecimal percentual) {
		BigDecimal aumento = calcularValorDoAumento(percentual);
		this.salario = this.salario.add(aumento).setScale(2, RoundingMode.HALF_UP);
	}

//metodo responsavel por gerar o valor do aumento do funcionario	
	private BigDecimal calcularValorDoAumento(BigDecimal percentual) {
		return salario.multiply(percentual);
	}

}








