package testes;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import data.*;

public class CaixaTester {

	ArrayList<Cliente> filaPri = new ArrayList<Cliente>();
	ArrayList<Cliente> filaNormal = new ArrayList<Cliente>();

	Cliente idoso;
	Cliente jovem;

	Caixa caixaPri;
	Caixa caixaNormal;

	@Before
	public void setUp(){
		// Criar um Caixa Prioritário e um Normal
		caixaPri = new Caixa(true);
		caixaNormal = new Caixa(false);

		// Criar filas prioritária e normal
		filaPri = new ArrayList<Cliente>();
		filaNormal = new ArrayList<>();

		//Criar  os clientes
		idoso = new Cliente("Idoso", 65);
		jovem = new Cliente("Jovem", 15);

		//Resetar as Filas
		filaPri.clear();
		filaNormal.clear();

		//Adicionmar os Clientes nas filas
		filaNormal.add(jovem);
		filaPri.add(idoso);
		filaNormal.add(idoso);

	}

	@Test
	public void testCaixaPrioritarioRetornarIdoso (){
		String  expected = caixaPri.getCli(filaPri, filaNormal);

		assertEquals(expected, idoso.getNome());	
	}

	@Test
	public void testCaixaNormalRetornarJovem(){
		String expected = caixaNormal.getCli(filaPri, filaNormal);

		assertEquals(expected, jovem.getNome());
	}

	@Test
	public void testFilaPrioritariaVazia(){	
		filaPri.clear();
		filaNormal.clear();
		assertNull(caixaPri.getCli(filaPri, filaNormal));	
	}

	@Test
	public void testFilaNormalVazia(){
		filaNormal.clear();
		assertNull(caixaNormal.getCli(filaPri, filaNormal));
	}

	@Test
	public void testRemoverIdosoAposChamada(){
		caixaPri.getCli(filaPri, filaNormal);
		boolean contem = false;

		if((filaPri.contains(idoso)||filaNormal.contains(idoso)))
			contem = true;

		assertFalse(contem);
	}
	
	@Test
	public void testRemoverJovemAposChamada(){
		boolean contem = false;
		
		caixaNormal.getCli(filaPri, filaNormal);
		
		if(filaNormal.contains(jovem))
			contem = true;
		
		assertFalse(contem);
	}
}


