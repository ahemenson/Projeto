import static org.junit.Assert.*;

import org.junit.Test;


public class ProjetoTeste {

		
	@Test
	public void testaNomes(){
		Pessoa P = new Pessoa();
		P.adicionaNome("Jo�o");				
		assertFalse("esperado que seja falso", P.isNome("Lucas"));
		assertTrue("esperado que seja verdadeiro", P.isNome("Jo�o"));
		P.mudaNome("Pedro");
		assertFalse("esperado que seja falso", P.isNome("Jo�o"));
		assertTrue("esperado que seja verdadeiro", P.isNome("Pedro"));
		assertEquals("esperado que seja igual", "Pedro", P.getNome());
		assertNotNull("esperado que n�o seja null", P.getNome());
		
		
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
		
		
//colaborando no projeto		
	}

	
	
	

}
