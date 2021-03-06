package data;
import java.util.ArrayList;

public class DataManager {

	private ArrayList<Cliente> filaNormal;
	private ArrayList<Cliente> filaPrioritaria;
	private Caixa[] caixas;
	private int nroCaixa = 1;
	private int qtdCaixas;

	public DataManager(int qtdCaixas){
		filaNormal = new ArrayList<>();
		filaPrioritaria = new ArrayList<>();
		caixas = new Caixa[qtdCaixas];
		this.qtdCaixas = qtdCaixas;

		for(int i = 0; i<qtdCaixas;i++){
			if(i<6)
				caixas[i]=new Caixa(true);
			else
				caixas[i]=new Caixa(false);
		}
	}

	public void cadastrarCliente(String nome, int idade){
		if(idade>=65){
			filaNormal.add(new Cliente(nome, idade));
			filaPrioritaria.add(new Cliente(nome, idade));
		}
		else
			filaNormal.add(new Cliente(nome, idade));
	}

	public String passarCliente (){
		String proxCliente = null;

		if (!filaNormal.isEmpty())			
			proxCliente = "Senhor " + caixas[nroCaixa-1].getCli(filaPrioritaria, filaNormal)+ " passar no caixa "+(nroCaixa)+".";				
		else {
			proxCliente = "N�o h� clientes";
			nroCaixa = 1;
		}

		if(nroCaixa >=qtdCaixas)
			nroCaixa = 1;
		else
			nroCaixa++;

		return proxCliente;
	}

}
