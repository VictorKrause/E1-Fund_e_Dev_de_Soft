package testes;

import static org.junit.Assert.*;

import org.junit.*;
import data.DataManager;

public class DataTester {

	DataManager data = new DataManager(10);

	@Test
	public void testRetornarQueNaoHaClientes(){
		String expected = "Não há clientes";
		
		assertEquals(expected, data.passarCliente());
	}
}
