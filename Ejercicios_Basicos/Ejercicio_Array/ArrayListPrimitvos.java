import java.util.ArrayList;
import java.util.Scanner;


class Animales{
	private String Tipo;
	private int Patas;


	public Animales(String tipo,int patas){
		this.Tipo = tipo;
		this.Patas = patas;
	}
	//metodos para obtener datos de atributos privados en otras clases
	public String getTipo(){
		return Tipo;
	}

	public int getPatas(){
		return Patas;
	}
}


class Perro extends Animales{
	
	private String Nombre;
	private int Edad;

	public Perro(String nombre,int edad,String tipo,int patas){
		super(tipo,patas);
		this.Nombre = nombre;
		this.Edad = edad;
	}

	public String toString(){
		return "Nombre: " + Nombre + ", Edad: " + Edad + ", Tipo: "+ getTipo() +", Patas: "+ getPatas();

	}

	

}

public class  ArrayListPrimitvos{
	public static void main(String[] args){
		Perro Canela = new Perro("Canela",2,"Perro",4);
		System.out.println(Canela);
	       
		ArrayList<Perro> ListaPerros = new ArrayList<>();
		ListaPerros.add(new Perro("molly",1,"Perro",6));



	}

}
