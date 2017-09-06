package br.com.institutoivoti;

import java.util.Scanner;

import br.com.institutoivoti.lib.ContaBanco;

public class Main {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			
			System.out.println("Cadastro de conta");				
			
			System.out.print("Digite o nome: ");
			String nome = s.next();
			
			System.out.print("Digite a agência: ");
			String agencia = s.next();
			
			System.out.print("Digite o número da conta: ");
			String numero = s.next();
			
			ContaBanco conta = new ContaBanco();
			conta.Credito(1000);
			conta.ImprimeDados();
		
		}

	}