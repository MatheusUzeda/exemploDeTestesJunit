package br.com.testes.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.testes.tdd.modelo.Funcionario;
// classe de calculo de bonus
public class BonusService {
//metodo para calcular o bonus de um funcionario
	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
//logica pra saber se o funcionario ganha mais 1000 de salario
		//Utilizando principio da inversao nesse if
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcionario com salario maior do que R$1000 nao pode receber bonus!");
		}

		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
