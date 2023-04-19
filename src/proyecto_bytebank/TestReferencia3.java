package proyecto_bytebank;

public class TestReferencia3 {

	public static void main(String[] args) {
		
	//	Cuenta cuentaDeDaniel = new Cuenta(); // se crea constructor con parametro de entrada AGENCIA
		Cuenta cuentaDeDaniel = new Cuenta(1987);
		
		System.out.println("Primera forma de crear el Titular\n");
		Cliente cliente = new Cliente();
		
	//	cuentaDeDaniel.titular = cliente;//Se encapsula Atributo TITULAR
		cuentaDeDaniel.setTitular(cliente);
		
	//	cliente.nombre = "Daniel Alfonso Torres Martinez"; //Se encapsula Atributo CLIENTE.NOMBRE
		cliente.setNombre("Daniel Alfonso Torres Martinez");
		
	//	System.out.println("Objeto Cliente desde Cuenta :"+ cuentaDeDaniel.titular); //Se encapsula Atributo TITULAR
		System.out.println("Objeto Cliente desde Cuenta :"+ cuentaDeDaniel.getTitular());
		
	//	System.out.println("Objeto Cliente desde Cuenta :"+ cuentaDeDaniel.titular.nombre); //Se encapsula Atributo CLIENTE.NOMBRE
	//	System.out.println("Objeto Cliente desde Cuenta :"+ cuentaDeDaniel.titular.getNombre()); //Se encapsula Atributo TITULAR
		System.out.println("Objeto Cliente desde Cuenta :"+ cuentaDeDaniel.getTitular().getNombre());
		
		//Otra forma de crear el cliente y asignarlo a la Cuenta
		
		System.out.println("\nSegunda forma de crear el Titular\n");
		
	//	cuentaDeDaniel.titular = new Cliente(); //Se encapsula Atributo TITULAR
		cuentaDeDaniel.setTitular(new Cliente());
		
	//	cuentaDeDaniel.titular.nombre = "Cheo Torres"; //Se encapsula Atributo CLIENTE.NOMBRE
	//	cuentaDeDaniel.titular.setNombre("Cheo Torres"); //Se encapsula Atributo TITULAR
		cuentaDeDaniel.getTitular().setNombre("Cheo Torres");
		
	//	System.out.println("Nuevo Objeto de Cliente dentro de cuenta :"+cuentaDeDaniel.titular.nombre); //Se encapsula Atributo CLIENTE.NOMBRE
	//	System.out.println("Nuevo Objeto de Cliente dentro de cuenta :"+cuentaDeDaniel.titular.getNombre()); //Se encapsula Atributo TITULAR
		System.out.println("Nuevo Objeto de Cliente dentro de cuenta :"+cuentaDeDaniel.getTitular().getNombre());
		
		System.out.println("Objeto Cliente :"+cliente);
	//	System.out.println("Objeto Cliente desde Cuenta :"+cuentaDeDaniel.titular); //Se encapsula Atributo TITULAR
		System.out.println("Objeto Cliente desde Cuenta :"+cuentaDeDaniel.getTitular());
		
		//Creado el tirular 2 directamente en la clase Cuenta
		
		System.out.println("\nTercera forma de crear el Titular\n");
	//	System.out.println("Objeto Cliente 1 desde Cuenta :"+cuentaDeDaniel.titular); //Se encapsula Atributo TITULAR
		System.out.println("Objeto Cliente 1 desde Cuenta :"+cuentaDeDaniel.getTitular());
		
	//	System.out.println("Objeto Cliente 2 desde Cuenta :"+cuentaDeDaniel.titular2); //Se encapsula Atributo TITULAR2
		System.out.println("Objeto Cliente 2 desde Cuenta :"+cuentaDeDaniel.getTitular2());
		
	//	System.out.println("Nuevo Objeto de Cliente 1 dentro de cuenta :"+cuentaDeDaniel.titular.nombre); //Se encapsula Atributo CLIENTE.NOMBRE
	//	System.out.println("Nuevo Objeto de Cliente 1 dentro de cuenta :"+cuentaDeDaniel.titular.getNombre()); //Se encapsula Atributo TITULAR
		System.out.println("Nuevo Objeto de Cliente 1 dentro de cuenta :"+cuentaDeDaniel.getTitular().getNombre());
		
	//	System.out.println("Nuevo Objeto de Cliente 2 dentro de cuenta :"+cuentaDeDaniel.titular2.nombre); //Se encapsula Atributo CLIENTE.NOMBRE		
	//	System.out.println("Nuevo Objeto de Cliente 2 dentro de cuenta :"+cuentaDeDaniel.titular2.getNombre()); //Se encapsula Atributo TITULAR2
		System.out.println("Nuevo Objeto de Cliente 2 dentro de cuenta :"+cuentaDeDaniel.getTitular2().getNombre());
		

	}

}
