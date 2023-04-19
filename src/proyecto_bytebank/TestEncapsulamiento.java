package proyecto_bytebank;

public class TestEncapsulamiento {

	public static void main(String[] args) {
	//	Cuenta daniel = new Cuenta(); // se crea constructor con parametro de entrada AGENCIA
		Cuenta daniel = new Cuenta(2023);
		
		Cliente titular1 = new Cliente();
		titular1.setNombre("Cheo");
		titular1.setDocumento("8633832");
		
		daniel.setTitular(titular1);
		
		Cliente titular2 = daniel.getTitular();
		
		System.out.println("Objeto Cliente :"+titular1);
		System.out.println("Objeto Cliente desde Cuenta :"+daniel.getTitular());
		System.out.println("Objeto Cliente 2 con referencia a Cliente 1 :"+titular2);
		
		

	}

}
