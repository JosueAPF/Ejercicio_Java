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
	

}

public class ArrayList_1{
	public static void main(String[] args){
		MyArrayList newarrg = new MyArrayList();
		newarrg.Insercion("hola");
		newarrg.Insercion("Mundo");
		newarrg.Insercion("Java");
		newarrg.Recorrido();

	}

}
