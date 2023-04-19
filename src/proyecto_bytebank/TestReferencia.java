package proyecto_bytebank;

public class TestReferencia {

	public static void main(String[] args) {
		
	//	Cuenta primeraCuenta = new Cuenta(); // se crea constructor con parametro de entrada AGENCIA
		Cuenta primeraCuenta = new Cuenta(2020);
		
	//	primeraCuenta.saldo = 200.00; //Se encapsula Atributo SALDO
		primeraCuenta.depositar(200);
		
		Cuenta segundaCuenta = primeraCuenta;
	//	segundaCuenta.saldo = 100; //Se encapsula Atributo SALDO
		segundaCuenta.depositar(100);
		
	//	System.out.println("Saldo Primera Cuenta: "+primeraCuenta.saldo); //Se encapsula Atributo SALDO 
		System.out.println("Saldo Primera Cuenta: "+primeraCuenta.getSaldo());
		
	//	System.out.println("Saldo Segunda Cuenta: "+segundaCuenta.saldo); //Se encapsula Atributo SALDO		 
		System.out.println("Saldo Segunda Cuenta: "+segundaCuenta.getSaldo());
		
	//	segundaCuenta.saldo +=400; //Se encapsula Atributo SALDO
		segundaCuenta.depositar(400);
		
	//	System.out.println("Saldo Primera Cuenta: "+primeraCuenta.saldo); //Se encapsula Atributo SALDO
		System.out.println("Saldo Primera Cuenta: "+primeraCuenta.getSaldo());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if(primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo Objeto");
		}else {
			System.out.println("Son objetos diferentes");
		}

	}

}
