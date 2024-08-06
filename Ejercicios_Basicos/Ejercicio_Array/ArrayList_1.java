import java.util.Scanner;
import java.util.ArrayList;
//instanciando la lib :ArrayList<String> list = new ArrayList<>();


class MyArrayList{
	private ArrayList<String> list;
	private Scanner in;
	
	public MyArrayList(){
		list = new ArrayList<>();
		in = new Scanner(System.in);
	}
	public void Insercion(String dato){
		list.add(dato);
	}
	//uso de get() para acceder a los elementos
	public void Recorrido(){
		for(int i=0;i<list.size();i++){
			System.out.println("Dato no.["+(i+1)+"]"+list.get(i));
		}
	}
	//eliminacion de un elemento segun su indice
	public void Eliminacion(int indexArrg){
		System.out.println("Ingrese un indice valido");
		indexArrg = in.nextInt();
		
		//si indexArrg es mayor o igual a cero && indexArrg es menor a el tamano total del array<list>
		if(indexArrg >=0 && indexArrg <list.size()){
			System.out.println("Eliminado");
			//guardamos en una variable el indice eliminado
			//del tipo String para que retorne el valor eliminado
			String ValorEliminado = list.remove(indexArrg);
			System.out.println("Dato Eliminado : "+ValorEliminado);
		}else{
			System.out.println("Indece fuera de rango");
		}
	}

}

public class ArrayList_1{
	public static void main(String[] args){
		MyArrayList newarrg = new MyArrayList();
		newarrg.Insercion("hola");
		newarrg.Insercion("Mundo");
		newarrg.Insercion("Java");
		newarrg.Recorrido();
		newarrg.Eliminacion(0);
		newarrg.Recorrido();
	}

}
