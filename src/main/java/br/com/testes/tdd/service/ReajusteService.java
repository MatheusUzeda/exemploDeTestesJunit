package br.com.testes.tdd.service;

import java.math.BigDecimal;

import br.com.testes.tdd.modelo.Desempenho;
import br.com.testes.tdd.modelo.Funcionario;

public class ReajusteService {
//metodo que recebe dois parametros,recebe um status de um enum que retorna um valor
//de percentual de reajuste, esse valor e guardado na variavel reajuste, e passado 
//ao metodo reajustar salario q e responsavel por alterar o valor do salario, e assim concede o reajuste
	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		BigDecimal reajuste = desempenho.percentualReajuste();
		funcionario.reajustarSalario(reajuste);
	}

}
