package junit.teste;

import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import cucumber.modelo.Conta;



public class ContaTesteJUnit {
	
private Conta conta;
	
	@Before
	public void iniciar(){
		conta = Mockito.mock(Conta.class);
	}
	
	@Test
	public void deveTentarDepositar(){
		when(conta.depositar(Mockito.anyDouble())).thenReturn(Boolean.TRUE);
	}

}
