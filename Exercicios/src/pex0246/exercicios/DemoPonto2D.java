package pex0246.exercicios;

public class DemoPonto2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ponto2D p1;
		Ponto2D p2, p3, p4;
		
		p1 = new Ponto2D();
		p2 = new Ponto2D();
		
		p1.inicializaPonto2D(-1.34,9.17);
		
		System.out.println("As coordenadas do ponto p1 s�o: "+p1);
		System.out.println("As coordenadas do ponto p2 s�o: " + p2);
		
		p3 = p1.clona();
		p4 = p1.origem();
		
		System.out.println("As coordenadas do ponto p3 s�o: "+p3);
		System.out.println("As coordenadas do ponto p4 s�o: "+p4);
		
		System.out.println("p1 est� na mesma posi��o que p2? "+p1.eIgual(p2));
		System.out.println("p1 est� na mesma posi��o que p3? "+p1.eIgual(p3));
		System.out.println("p1 est� na mesma posi��o que p4? "+p1.eIgual(p4));
		System.out.println("p2 est� na mesma posi��o que p4? "+p2.eIgual(p4));
		
		System.out.println(new Ponto2D());
		
	}

}
