import static org.junit.Assert.*;

import org.junit.Test;


public class ProjetoTeste {

		
	@Test
	public void testaNomes(){
		Pessoa P = new Pessoa();
		P.adicionaNome("João");				
		assertFalse("esperado que seja falso", P.isNome("Lucas"));
		assertTrue("esperado que seja verdadeiro", P.isNome("João"));
		P.mudaNome("Pedro");
		assertFalse("esperado que seja falso", P.isNome("João"));
		assertTrue("esperado que seja verdadeiro", P.isNome("Pedro"));
		assertEquals("esperado que seja igual", "Pedro", P.getNome());
		assertNotNull("esperado que não seja null", P.getNome());
		
		
	}
	
	@Test
	public void testaIdades(){
		Pessoa P2 = new Pessoa();
		P2.adicionaIdade(30);
		assertFalse("esperado que seja falso", P2.isIdade(40));
		assertTrue("esperado que seja verdadeiro", P2.isIdade(30));
		P2.mudaIdade(40);
		assertTrue("esperado que seja verdadeiro", P2.isIdade(40));
		assertFalse("esperado que seja falso", P2.isIdade(30));
		
		
		
	}

	
	
	

}
