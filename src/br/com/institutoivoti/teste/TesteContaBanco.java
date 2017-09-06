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
	public void testaNomeECPF() {
		conta.Titular("Grovy");
		conta.cpfDoCidadao("038.828.850-76");
		assertEquals(conta.getTitular(), "Grovy");
		assertEquals(conta.getCPF(), "038.828.850-76");
	}
	
	@Test
	public void testaAgencia() {
		conta.Agencia("21-89");
		assertEquals(conta.getAgencia(), "21-89");
	}
	
	@Test
	public void testaNumeroConta() {
		conta.NumeroConta("1234-5");
		assertEquals(conta.getNumero(), "1234-5");
	}
	
	@Test
	public void testaSaldo() {
		conta.Saldo();
		assertEquals(conta.getSaldo(), 0, 0);
	}
	
	@Test
	public void testaDebito() {
		conta.Debito(20);
		assertEquals(conta.getDebito(), -20, 0);
	}
	
	@Test
	public void testaCredito() {
		conta.Credito(100);
		assertEquals(conta.getCredito(), 100, 0);
	}
	
	@Test
	public void testaLimiteSaldo() {
		conta.Debito(20);
		conta.limiteConta(-30);
		assertEquals(conta.getLimite(), false);
	}
	
	@Test
	public void excedendoLimiteConta() {
		conta.Saldo();
		conta.Debito(110);
		conta.limiteConta(-10);
		assertEquals(conta.getLimite(), true);
	}
	
}


