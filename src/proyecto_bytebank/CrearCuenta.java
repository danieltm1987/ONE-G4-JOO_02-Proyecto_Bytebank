package proyecto_bytebank;

public class CrearCuenta {

	public static void main(String[] args) {
		System.out.println("Cuentas - ByteBank !!");
		
	//	Cuenta primeraCuenta = new Cuenta(); // se crea constructor con parametro de entrada AGENCIA
		Cuenta primeraCuenta = new Cuenta(10);
		
		
	//	primeraCuenta.saldo = 1000;	//Se encapsula Atributo SALDO
		primeraCuenta.depositar(1000);	
	//	System.out.println("Saldo Primera Cuenta:"+primeraCuenta.saldo); //Se encapsula Atributo SALDO	
		System.out.println("Saldo Primera Cuenta:"+primeraCuenta.getSaldo());
		
		
	//	Cuenta segundaCuenta = new Cuenta(); // se crea constructor con parametro de entrada AGENCIA
		Cuenta segundaCuenta = new Cuenta(101);
		
	//	segundaCuenta.saldo = 500; //Se encapsula Atributo SALDO
		segundaCuenta.depositar(500);			
		
	//	System.out.println("Saldo Segunda Cuenta:"+segundaCuenta.saldo); //Se encapsula Atributo SALDO
		System.out.println("Saldo Segunda Cuenta:"+segundaCuenta.getSaldo());
		
	//	System.out.println("Agencia primera Cuenta:"+primeraCuenta.agencia); //Se encapsula Atributo AGENCIA
		System.out.println("Agencia primera Cuenta:"+primeraCuenta.getAgencia());
	}

}
