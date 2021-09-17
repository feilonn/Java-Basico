package com.raul.javabasico.aula45;

public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "| "; 
		s += "Nome do Cliente = " + nomeCliente;
		s += " | Numero da Conta = " + numConta;
		s += " | Saldo = R$" + saldo;
		
		return s;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo - valor >= 0) {
			saldo -= valor;
			return true;
		}
		
		return false;
	}
	
}
