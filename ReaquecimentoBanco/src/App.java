import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		
		ArrayList<Cliente> filaPrioritaria = new ArrayList<>();
		ArrayList<Cliente> filaNormal = new ArrayList<>();
		
		filaNormal.add(new Cliente("Jovem1",15));
		filaNormal.add(new Cliente("Jovem2",15));
		filaNormal.add(new Cliente("Jovem3",15));

		filaPrioritaria.add(new Cliente("Idoso1",65));
		filaPrioritaria.add(new Cliente("Idoso2",65));
		filaPrioritaria.add(new Cliente("Idoso3",65));
	
		filaNormal.add(new Cliente("Idoso1",65));
		filaNormal.add(new Cliente("Idoso2",65));
		filaNormal.add(new Cliente("Idoso3",65));
		
		
		Caixa caixaTeste = new Caixa(true);

		
		System.out.println(caixaTeste.getCli(filaPrioritaria, filaNormal));
		System.out.println(caixaTeste.getCli(filaPrioritaria, filaNormal));
		System.out.println(caixaTeste.getCli(filaPrioritaria, filaNormal));
		System.out.println(caixaTeste.getCli(filaPrioritaria, filaNormal));
		System.out.println(caixaTeste.getCli(filaPrioritaria, filaNormal));
		System.out.println(caixaTeste.getCli(filaPrioritaria, filaNormal));
		System.out.println(caixaTeste.getCli(filaPrioritaria, filaNormal));
		System.out.println(caixaTeste.getCli(filaPrioritaria, filaNormal));
		
	}

}
