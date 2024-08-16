


class Persona{
	private String Nombre;
	private int Edad;
	private double Altura;


	public Persona(String nombre,int edad,double altura){
		this.Nombre =nombre;
		this.Edad = edad;
		this.Altura = altura;
	}

	public String toString(){
		return "{"+" Nombre :"+Nombre+" Edad :"+Edad+" Altura :"+Altura+" }";
	}


}

public class ArrayObjetos{
	public static void main(String[] args){
		Persona[] personas = new Persona[3];
		personas[0] = new Persona("jose",12,1.80);
		personas[1] = new Persona("miguel",18,1.50);
		personas[2] = new Persona("andres",5,2.50);

		//mostrando el array de objetos
		for(int i=0;i<personas.length;i++){
			System.out.println(personas[i]);
		}
	}

}
