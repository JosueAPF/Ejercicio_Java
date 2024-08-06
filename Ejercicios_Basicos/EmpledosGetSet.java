/*
 *Ejercicio 1: Cálculo de Bonificaciones y Salario Total

Crear una clase Empleado con atributos: nombre, edad, profesion, puesto y salario.
Implementar métodos getter y setter para cada atributo.
Implementar un método toString que muestre todos los detalles del empleado.



Crear una clase CalculosBoni que tenga un método calcBonificacion 
que acepte un objeto Empleado y calcule la bonificación basada en su salario y antigüedad.
Implementar un método que imprima los detalles del empleado junto con su bonificación y salario total.
bonificacion:
antiguedad de de 2 anos en adelatnte = 5%
antiguedad de 5 anos en adelante = 10%
antiguedad de mas de 5 anos = 15%
menor a 2 anos = 0%

Crear una lista de empleados.
Para cada empleado en la lista, calcular la bonificación usando CalculosBoni y mostrar los resultados.
 *
 *
 * */



import java.util.Scanner;
import java.util.ArrayList;

class Empleados{
	private String nombre,profesion,puesto;
	private int edad,salario,antiguedad;
	
	public String setNombre(String nombre){
		return this.nombre = nombre;
	}
	
	public int setSalario(int salario){
		return this.salario = salario;
	}

	public int setAntiguedad(int antiguedad){
		return this.antiguedad = antiguedad;
	}

	public String getNombre(){
		return nombre; 
	}

	public String getProfesion(){
		return profesion;
	}

	public String getPuesto(){
		return puesto;
	}
	
	public int getAntiguedad(){
		return antiguedad;
	}


	public int getEdad(){
		return edad;
	}

	public int getSalario(){
		return salario;
	}

	public String toString(){
                return "Nombre :"+nombre+" Salario:"+salario+" Anos antiguedad :"+antiguedad;
         }

	/*
	public String toString(){
		return "Nombre :"+nombre+" Salario :"+salario+" Puesto :"+puesto+" Antiguedad :"+antiguedad+" Profesion :"+profesion+" Edad :"+edad;
	}
	*/
}

class CalculosBoni{
	private double Boni=0;
	private double SalTotal=0;
	private Empleados empleados;
	
	public CalculosBoni(){
		empleados = new Empleados();
	}
	public void setEmp(String Nombre,int Salario,int Antiguedad){
		empleados.setNombre(Nombre);
		empleados.setSalario(Salario);
		empleados.setAntiguedad(Antiguedad);
		CalcularBoni();
	}	
	public void CalcularBoni(){
		int empAnt = empleados.getAntiguedad();
		int empSal = empleados.getSalario();

		if(empAnt >2){
			Boni = empSal*0.05;
		}else if(empAnt >= 5){
			Boni = empSal*0.10;
		}else if(empAnt <2){
			Boni = 0;
		}
		
		SalTotal = empSal+Boni;
		System.out.println("Nombre Empleado :"+empleados.getNombre());
		System.out.println("Salario Base :"+empleados.getSalario());
		System.out.println("Bonificacion :"+Boni);
		System.out.println("Sanlario Total :"+SalTotal);

	}
	public double getSalTotal(){
		return SalTotal;
	}
	public double getBoni(){
		return Boni;
	}
	public String toString(){
		return "Nombre :"+empleados.getNombre()+" Salario Base :"+empleados.getSalario()+" Bonificacion :"+getBoni()+" Salario Total :"+getSalTotal();

	}
}


//clase agrega elementos al array (esta de mas)
class addArray{
	private ArrayList<Object> list;

	public addArray(){
		list = new ArrayList<>();
	}

	public void Push(Object objeto){
		System.out.println("Se ha agregado :"+" Empleado  ");
		list.add(objeto);
	}

	public void Recorrido(){
		for(int i=0;i<list.size();i++){
			System.out.println("Empleado No."+(i+1)+"  ");
			System.out.println(list.get(i));
		}
	}



}

public class EmpledosGetSet {
	public static void main(String[] args){
		//instancia de clase creacion de objetos
		CalculosBoni emp = new CalculosBoni();
		CalculosBoni emp2 = new CalculosBoni();
		addArray arr = new addArray();
		
		//llamado a los metodos
		emp.setEmp("josue",2000,5);
		arr.Push(emp);
		arr.Recorrido();

		emp2.setEmp("Pepe",4000,6);
		arr.Push(emp2);
		arr.Recorrido();
	}

}

