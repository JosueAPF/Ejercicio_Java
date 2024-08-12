import java.util.ArrayList;


class Carro{
	private String Marca;
	private String Color;
	private int Ano;

	public Carro(String marca,String color,int ano){
		this.Marca = marca;
		this.Color = color;
		this.Ano = ano;
	}

	public String toString(){
		return "{Marca :"+Marca+" Color :"+Color+" Ano :"+Ano+"}";
	}

}


public class Eje1_ArrayList{
	public static void main(String[] args){
		ArrayList<Carro> CarList = new ArrayList<>();

		//isEmpty para saber si esta vacio
                if(CarList.isEmpty()){
                     System.out.println("Actualmente sin elementos");
                }

		Carro carro1 = new Carro("mazda","Azul",2018);
		System.out.println(carro1);
		
		//con size obtenemos el tamano actual del ArrayList
		System.out.println("Sin ningun elemento :"+CarList.size());
		
		CarList.add(carro1);
		System.out.println("Un Objeto Cargado :"+CarList.size());
		System.out.println("Mostrando lo que tiene :"+CarList.get(0));

		
		//esta forma agregamos inmediatamente un objeto al ArrayList pero no se instancia un objeto
		CarList.add(new Carro("Toyota","Rojo",1998));
		System.out.println("Otra Forma de Cargarle Objetos(no instanciados) :"+CarList.get(1));

		System.out.println("Se ha agregado uno mas");
		CarList.add(new Carro("Hiunday","Gris",2008));

		
		//revizar si el array esta vacio nuevamente, sino que muestre el contenido del array
		if(CarList.isEmpty()){
			System.out.println("No hay elementos cargados");
		}
		for(int i=0;i<CarList.size();i++){
			System.out.println("Posicion :["+i+"]"+CarList.get(i));
		}
	}
}
