import java.util.*;
public class Caixa {
	private boolean prioritario;
	
	
	public Caixa(boolean prioritario){
		this.prioritario = prioritario;
	}
	
	public String getCli (ArrayList <Cliente> filaPrioritaria, ArrayList<Cliente>filaNormal){
		String nomeProxCliente = null;
		if(!filaPrioritaria.isEmpty() && prioritario){
			Cliente proxCli =filaPrioritaria.get(0);
			nomeProxCliente = proxCli.getNome();
			filaPrioritaria.remove(proxCli);
			filaNormal.remove(proxCli);
			return nomeProxCliente;
		}
		
		nomeProxCliente = filaNormal.get(0).getNome();
		filaNormal.remove(0);
		
		return nomeProxCliente;

	}
}
	
	

