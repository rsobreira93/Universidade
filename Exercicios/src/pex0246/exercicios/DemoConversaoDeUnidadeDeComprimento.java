package pex0246.exercicios;

public class DemoConversaoDeUnidadeDeComprimento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConversaoDeUnidadeDeComprimento conv = null;
		System.out.println("Vinte p�s s�o: " + conv.pesParaCentimetros(20)+ " cent�metros");
		System.out.println("Cinco polegadas s�o: " + conv.polegadasParaCentimetros(5) + " cent�metros");
		
		//muito mais pratico acessar os metodos diretamente
		System.out.println("Vinte p�s s�o: " + ConversaoDeUnidadeDeComprimento.pesParaCentimetros(20)+" cent�metros");
		System.out.println("Cinco polegadas s�o: " + ConversaoDeUnidadeDeComprimento.polegadasParaCentimetros(5) + " cent�metros");
	}

}
