//crear una classe con 3 atributos para luego ser almacenado en una ArrayList
import java.util.Scanner;
import java.util.ArrayList;

class Empleados{
	private String Nombre;
	private int Edad;
	private int Salario;

	public Empleados(String Nombre,int Edad){
		this.Nombre = Nombre;
		this.Edad = Edad;
		
	}

	public String getEmpleado(){
		return Nombre;
	}

	public int getEdad(){
		return Edad;
	}
	/*
	 Cuando tienes un ArrayList que contiene objetos, como los empleados en tu caso, necesitas una forma de mostrar
	 la información de esos objetos. La manera más común de hacerlo es sobrescribiendo el método toString() en tu clase de objetos
	 (en este caso, Empleado).
	 *
	 *
	 * */
	//@Override
       public String toString() {
         return "Nombre: " + Nombre+"\n"+"Edad: "+ Edad;
       }

}

class MyArray{
	//se crea un array list de objetos ose se admiten cualquier tipo de datos
	private ArrayList<Empleados> empleados;
	private Scanner in;
	private String ENombre;
	private int Edad;

	public MyArray(){
		empleados = new ArrayList<>();
		in = new Scanner(System.in);
	}

	public void Insercion(){
		System.out.println("Ingrese un Nombre :");
		ENombre = in.nextLine();

		System.out.println("Ingrese la Edad :");
		Edad = in.nextInt();
		in.nextLine();
		
		Empleados empleado = new Empleados(ENombre,Edad);
		empleados.add(empleado);
	}
	public void Recorrido(){
		for(int i=0;i<empleados.size();i++){
			System.out.println("Datos Empleado");
			System.out.println(empleados.get(i));
		}
	}
	public void FullData(){
		///
	}
}

public class ArrayListClass{

	public static void main(String[] args){
		MyArray EmpleadosArrg = new MyArray();
		Scanner in = new Scanner(System.in);
		int i,opcSalir;
		boolean opc=true;
		
		while(opc){
			
			EmpleadosArrg.Insercion();
			//EmpleadosArrg.Recorrido();

			System.out.println("Desea Ingresar Mas Empleados 1:si 0:no");
			opcSalir = in.nextInt();
			in.nextLine();

			if(opcSalir == 0){
				System.out.println("Saliendo");
				opc = false;
				EmpleadosArrg.Recorrido();
			}
			
		}
	}

}
