/*
 *si empleado gana el minimo o 5000 quetzales si gana el minimo y tiene mas de 2 anos en la empresa darle una bonificacion del 5%
 *si empleado gana 5000 y tine antiguedad de 2 anos darle bonificacion del 10%
 *si gana mas de 5000 bonificacion = 0;
 *
 *mostrar:
 	nombre
	edad
	profesion
	puesto
	salario
	bonificacion
	salariototal

	el importe de la empresa
	que es la suma de todos los salario
 *
 * */


import java.util.Scanner;
import java.util.ArrayList;

class Empleado{
	private String Nombre,profesion;
	private int edad,salario;

	public Empleado(String Nombre,String profesion,int edad,int salario){
		this.Nombre = Nombre;
		this.profesion =profesion;
		this.edad=edad;
		this.salario =salario;
	}
	public int getSalario(){
		return salario;
	}
	public String toString(){
		return "Nombre :"+Nombre+" Profesion :"+profesion+" Edad :"+edad+" Salario :"+salario;
		
	}
	

}
//incompleto ==============================================>
class CalculosBoni extends Empleado{
	private double boni,SalTotal;
	public CalculosBoni(String Nombre,String profesion,int edad,int salario){
		super(Nombre,profesion,edad,salario);
		this.boni = 0.0;
		this.SalTotal = 0.0;
	}
	public void calc(){
		System.out.println(getSalario());	
	}


}


public class ArrayListEmpleados{
	public static void main(String[] args){
		CalculosBoni empleado = new CalculosBoni("jose","Cerragero",18,2000);
		System.out.println(empleado);
		empleado.calc();

	}
}
