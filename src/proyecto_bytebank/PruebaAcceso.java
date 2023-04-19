package proyecto_bytebank;

public class PruebaAcceso {

	public static void main(String[] args) {
		
	//	Cuenta cuenta = new Cuenta(); // se crea constructor con parametro de entrada AGENCIA
		Cuenta cuenta = new Cuenta(2000);
		
	//	cuenta.saldo = 200; //Se encapsula Atributo SALDO
		cuenta.depositar(200);
		cuenta.retirar(300);
		
	//	System.out.println("Saldo de mi cuenta :"+cuenta.saldo); //Se encapsula Atributo SALDO
		System.out.println("Saldo de mi cuenta :"+cuenta.getSaldo());
		
		//modificar el valor del atributo Saldo
		
		System.out.println("\nModificando directamente el valor de atribut SALDO\n");
	//	cuenta.saldo = cuenta.saldo - 300; //Se encapsula Atributo SALDO
		cuenta.retirar(300);
	//	System.out.println("Saldo de mi cuenta :"+cuenta.saldo
	//						+"¡¡¡Esta operacion no debe ser Permitida!!!"); //Se encapsula Atributo SALDO
		
		System.out.println("Saldo de mi cuenta :"+cuenta.getSaldo()
				+"¡¡¡Esta operacion no debe ser Permitida!!!");

	}

}
