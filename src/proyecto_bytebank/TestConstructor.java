package proyecto_bytebank;

public class TestConstructor {

	public static void main(String[] args) {
	//	Cuenta cuenta = new Cuenta(); // se crea constructor con parametro de entrada AGENCIA 
		
		Cuenta cuenta = new Cuenta(555);
		
	//	cuenta.setAgencia(-4); //se quite el setAgencia ya que se implementa en el constructor
		
		Cuenta cuenta2 = new Cuenta(10);
		Cuenta cuenta3 = new Cuenta(1987);
		Cuenta cuenta4 = new Cuenta(4000);
		
		System.out.println("Valor de Agencia :"+cuenta.getAgencia());
		System.out.println("Valor de Agencia :"+cuenta2.getAgencia());
		System.out.println("Valor de Agencia :"+cuenta3.getAgencia());
		System.out.println("Valor de Agencia :"+cuenta4.getAgencia());
		
		System.out.println("Valor de Total :"+Cuenta.getTotal());
		
							

	}

}
