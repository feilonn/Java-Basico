package com.raul.javabasico.aula43.labs;

public class Teste {

	public static void main(String[] args) {
	
	  	//TESTE CONTA BANCARIA 
		System.out.println("*** Teste Conta Bancaria ***");
		ContaBancaria contaSimples = new ContaBancaria();
		
		contaSimples.setNomeCliente("Raul");
		contaSimples.setNumConta("55555");
		
		contaSimples.depositar(200);
		realizarSaque(contaSimples, 90);
		realizarSaque(contaSimples, 120);
		
		System.out.println(contaSimples);
		
		//TESTE CONTA POUPANÇA

		System.out.println("\n\n*** Teste Conta Poupança ***");
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		contaPoupanca.setNomeCliente("Raul");
		contaPoupanca.setNumConta("88888");
		
		contaPoupanca.depositar(200);
		realizarSaque(contaPoupanca, 90);
		realizarSaque(contaPoupanca, 120);
		contaPoupanca.setDiaRendimento(15);
		
		if(contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado! Novo saldo = R$"+contaPoupanca.getSaldo());
		}else {
			System.out.println("Hoje não é dia de rendimento! Saldo atual = R$"+contaPoupanca.getSaldo());
		}
		
		System.out.println(contaPoupanca);
		
		//TESTE CONTA BANCARIA 
		System.out.println("\n\n*** Teste Conta Especial ***");
		ContaEspecial contaEspecial = new ContaEspecial();
				
		contaEspecial.setNomeCliente("Raul");
		contaEspecial.setNumConta("77777");
		contaEspecial.setLimite(40);
				
		contaEspecial.depositar(200);
		realizarSaque(contaEspecial, 90);
		realizarSaque(contaEspecial, 120);
		realizarSaque(contaEspecial, 40);
				
		System.out.println(contaEspecial);
	}
	
	private static void realizarSaque(ContaBancaria conta, double valor) {
		if(conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso. Novo saldo = R$"+conta.getSaldo());
		}else {
			System.out.println("Saldo Insuficiente! Não foi possível efetuar o saque no valor de R$"+valor);
		}
	}

}
