package proyecto_bytebank;

public class TestReferencia2 {

	public static void main(String[] args) {
		Cliente daniel = new Cliente();
		
	//	daniel.nombre = "Daniel Alfonso"; //se Encapsulan
		daniel.setNombre("Daniel Alfonso");
	//	daniel.documento = "1047218293"; //se Encapsulan
		daniel.setDocumento("1047218293");
	//	daniel.telefono = "+57 3152343643"; //se Encapsulan
		daniel.setTelefono("+57 3152343643");
		
		
		
	//	Cuenta cuentaDeDaniel = new Cuenta(); // se crea constructor con parametro de entrada AGENCIA
		Cuenta cuentaDeDaniel = new Cuenta(4200);
		
	//	cuentaDeDaniel.agencia = 1; //Se encapsula Atributo AGENCIA
	//	cuentaDeDaniel.setAgencia(1); //se quite el setAgencia ya que se implementa en el constructor
		
	//	cuentaDeDaniel.titular= daniel; //Se encapsula Atributo TITULAR
		cuentaDeDaniel.setTitular(daniel);
		
	//	System.out.println("Agencia :"+cuentaDeDaniel.agencia); //Se encapsula Atributo AGENCIA
		System.out.println("Agencia :"+cuentaDeDaniel.getAgencia());
		
	//	System.out.println("Nombre :"+cuentaDeDaniel.titular.nombre); //Se encapsula Atributo
	//	System.out.println("Nombre :"+cuentaDeDaniel.titular.getNombre()); //Se encapsula Atributo TITULAR
		System.out.println("Nombre :"+cuentaDeDaniel.getTitular().getNombre());
		
	//	System.out.println("Documento :"+cuentaDeDaniel.titular.documento); //Se encapsula Atributo
	//	System.out.println("Documento :"+cuentaDeDaniel.titular.getDocumento()); //Se encapsula Atributo TITULAR
		System.out.println("Documento :"+cuentaDeDaniel.getTitular().getDocumento());
		
	//	System.out.println("Telefono :"+cuentaDeDaniel.titular.telefono); //Se encapsula Atributo
	//	System.out.println("Telefono :"+cuentaDeDaniel.titular.getTelefono()); //Se encapsula Atributo TITULAR
		System.out.println("Telefono :"+cuentaDeDaniel.getTitular().getTelefono());

	//	System.out.println("Objeto desde Cuenta :"+cuentaDeDaniel.titular); //Se encapsula Atributo TITULAR
		System.out.println("Objeto desde Cuenta :"+cuentaDeDaniel.getTitular());
		
		System.out.println("Objeto Cliente :"+daniel);

	}

}
