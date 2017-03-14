import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		
		ArrayList<Cliente> clientes = new ArrayList<>();
		
		
		Caixa caixaTeste = new Caixa(01, true);
		System.out.println(caixaTeste.getCli(clientes));
		for(Cliente cli: clientes)
			System.out.println(cli.getNome());
				
	}

}
