package com.raul.javabasico.aula52;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		int opcao = 1;
		while(opcao != 3) {
			opcao = obterOpcaoMenu(scan);
			
			if(opcao == 1) { // Consultar contato
				consultarContato(scan, agenda);
			}else if(opcao == 2) { // Adicionar contato
				adicionarContato(scan, agenda);
			}else { // Sair1
				System.out.println("\n**** APLICAÇÃO ENCERRADA ****");
				System.exit(0);
			}
		}			
	}
	
	public static void adicionarContato(Scanner scan, Agenda agenda) {
		System.out.println("Criação de contato, entre com as informações a seguir.");
		
		String nome = lerInformacaoString(scan, "Entre com o nome do contato: ");
		String telefone = lerInformacaoString(scan, "Entre com o telefone do contato: ");
		String email = lerInformacaoString(scan, "Entre com o email do contato: ");
		
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setEmail(email);
		
		System.out.println("Contato a ser criado: ");
		System.out.println(contato);
		
		try {
			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			System.out.println("-----Contatos da agenda-----: ");
			System.out.println(agenda);
		}
	}
	
	public static void consultarContato(Scanner scan, Agenda agenda) {
		String nomeContato = lerInformacaoString(scan, "Informe o nome do contato a ser pesquidado: ");
		try {
			if(agenda.consultaContato(nomeContato) >= 0) {
				System.out.println("O contato existe!");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static String lerInformacaoString(Scanner scan, String msg) {
		
		System.out.println(msg);
		String entrada = scan.nextLine();
		
		return entrada;
	}
	
	public static int obterOpcaoMenu(Scanner scan) {
		
		boolean entradaValida = false;
		int opcao = 3;
		
		while(!entradaValida) {
			System.out.println("Informe a opção desejada: ");
			System.out.println("1: Consultar contato");
			System.out.println("2: Adicionar contato");
			System.out.println("3: Sair");
			
			try {
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				
				if(opcao < 1 || opcao > 3) {
					throw new Exception("Entrada inválida!");
				}else {
					entradaValida = true;
				}
			}catch(Exception exc) {
				System.out.println("Entrada inválida! Informe uma opção válida.\n");
			}
			
		}	
		
		return opcao;
	}

}
