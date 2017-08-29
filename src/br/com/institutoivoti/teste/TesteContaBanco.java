package br.com.institutoivoti.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.institutoivoti.lib.ContaBanco;

public class TesteContaBanco {
	private ContaBanco conta;
	
	@Before
	public void before() {
		conta = new ContaBanco();	
	}
	
	@Test
	public void testanome() {
		conta.Titular("Nelson");
		assertEquals(conta.getTitular(), "Nelson");
		
		}
		
		@Test
		public void testaAgencia() {
			conta.Agencia("Moneybras");
			assertEquals(conta.getAgencia(), "Moneybras");
		}
		
		@Test
		public void testaNumeroConta() {
			conta.NumeroConta("9854-4");
			assertEquals(conta.getNumero(), "9854-4");
		}
		
		@Test
		public void testaSaldo() {
			conta.Saldo(785.30);
			assertEquals(conta.getSaldo(), 785.30, 0);
		}
		
		@Test
		public void testaSaldoZerado() {
			conta.Saldo(0);
			assertEquals(conta.getSaldo(), 0, 0);
		}
		
		@Test
		public void incrementaSaldo() {
			conta.Saldo(0);
			conta.IncrementaSaldo(20);
			assertEquals(conta.incrementaSaldo(), 20, 0);
		}
		
		@Test
		public void debito() {
			conta.Saldo(50);
			conta.DebitaDaConta(20);
			assertEquals(conta.getDebitoConta(), 30, 0);
		}
		
		@Test
		public void saldoNegativo() {
			conta.Saldo(0);
			conta.DebitaDaConta(10);
			assertEquals(conta.getDebitoConta(), -10, 0);
		}
		
		@Test
		public void incrementaSaldoNegativo() {
			conta.Saldo(-10);
			conta.IncrementaSaldo(20);
			assertEquals(conta.incrementaSaldo(), 10, 0);
		}
		
		@Test
		public void testaLimiteSaldo() {
			conta.Saldo(100);
			conta.DebitaDaConta(120);
			conta.limiteConta(-30);
			assertEquals(conta.getLimite(), -20, 0);
		}
		
		@Test
		public void excedendoLimiteConta() {
			conta.Saldo(100);
			conta.DebitaDaConta(110);
			conta.limiteConta(-10);
			assertEquals(conta.getLimite(), 2, 0);
	}
	 
	}


