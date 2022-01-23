package br.com.testes.tdd.modelo;

import java.math.BigDecimal;
//enum criado pra representar o percentual de reajuste de acordo com o desempenho
public enum Desempenho {
	A_DESEJAR {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.03");
		}
	}, 
	BOM {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.15");
		}
	},
	OTIMO {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.20");
		}
	};
	//A escolha do metodo abstrato e, para q todas as constantes implementem esse metodo 
	public abstract BigDecimal percentualReajuste();

}
