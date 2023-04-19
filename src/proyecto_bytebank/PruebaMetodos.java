package proyecto_bytebank;

public class PruebaMetodos {

	public static void main(String[] args) {
		
	//	Cuenta miCuenta = new Cuenta(); // se crea constructor con parametro de entrada AGENCIA 
		Cuenta miCuenta = new Cuenta(4500);
		
	//	miCuenta.saldo+=300; //Se encapsula Atributo SALDO
		miCuenta.depositar(300);
		miCuenta.depositar(300);
		
	//	System.out.println("Saldo de Mi Cuenta : "+miCuenta.saldo); //Se encapsula Atributo SALDO
		System.out.println("Saldo de Mi Cuenta : "+miCuenta.getSaldo());
		
		miCuenta.retirar(100);
		
	//	System.out.println("Nuevo Saldo de Mi Cuenta : "+miCuenta.saldo); //Se encapsula Atributo SALDO
		System.out.println("Nuevo Saldo de Mi Cuenta : "+miCuenta.getSaldo());
		
	//	Cuenta cuentaDeJimena = new Cuenta(); // se crea constructor con parametro de entrada AGENCIA
		Cuenta cuentaDeJimena = new Cuenta(2800);
		
		cuentaDeJimena.depositar(100);
		
		boolean puedeTransferir = cuentaDeJimena.transferir(400, miCuenta); 
		
		if(puedeTransferir) {
			System.out.println("Transferencia Exitosa...!!!");
		//	System.out.println("Nuevo Saldo de la Cuenta De Jimena: "+cuentaDeJimena.saldo); //Se encapsula Atributo SALDO
			System.out.println("Nuevo Saldo de la Cuenta De Jimena: "+cuentaDeJimena.getSaldo());
		}else {
			System.out.println("Fondos Insuficientes");
		//	System.out.println("Saldo de la Cuenta De Jimena: "+cuentaDeJimena.saldo); //Se encapsula Atributo SALDO
			System.out.println("Saldo de la Cuenta De Jimena: "+cuentaDeJimena.getSaldo());
		}
				
	//	System.out.println("Nuevo Saldo de Mi Cuenta : "+miCuenta.saldo); //Se encapsula Atributo SALDO		
		System.out.println("Nuevo Saldo de Mi Cuenta : "+miCuenta.getSaldo());

	}

}
