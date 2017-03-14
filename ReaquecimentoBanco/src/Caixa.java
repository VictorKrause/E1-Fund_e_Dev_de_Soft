import java.util.ArrayList;

public class Caixa {
	private int codCaixa;
	private boolean prioritario;
	
	
	public Caixa(int codCaixa, boolean prioritario){
		this.codCaixa = codCaixa;
		this.prioritario = prioritario;
	}
	
	public String getCli (ArrayList <Cliente> clientes){
		String nomeProxCliente = null;
		
		for(Cliente cli: clientes)
		if(prioritario)
			if(cli.getIdade()>=65){
				nomeProxCliente = cli.getNome();
				clientes.remove(cli);
				return nomeProxCliente;
			}
				
			else{
				nomeProxCliente = cli.getNome();
				clientes.remove(cli);
			}
		
		if(nomeProxCliente != null)
			return nomeProxCliente;
		return "Não há proximo cliente";
	}
}
	
	

