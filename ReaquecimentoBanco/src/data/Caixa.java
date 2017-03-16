package data;
import java.util.*;
public class Caixa {
	private boolean prioritario;
	
	
	public Caixa(boolean prioritario){
		this.prioritario = prioritario;
	}
	
	public String getCli (ArrayList <Cliente> filaPrioritaria, ArrayList<Cliente>filaNormal){
		String nomeProxCliente = null;
		Cliente cliRemover = null;
		
		if(!filaPrioritaria.isEmpty() && prioritario){
			Cliente proxCli =filaPrioritaria.get(0);
			nomeProxCliente = proxCli.getNome();
			filaPrioritaria.remove(proxCli);

			for(Cliente cli: filaNormal){
				String nome = cli.getNome();
				if(nomeProxCliente.equals(nome))
					cliRemover = cli;
			}
			
			filaNormal.remove(cliRemover);
			return nomeProxCliente;
		}
		
		nomeProxCliente = filaNormal.get(0).getNome();
		filaNormal.remove(0);
		
		return nomeProxCliente;

	}
}
	
	

