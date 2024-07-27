package com.MisEmpleados;

import java.util.Scanner;

class Bonificacion{
	private int Servicio;
	private int miSueldo;
	private double Bonificacion;
	private double Total,Importe;
	private double SueldoAnual;
	private Scanner in;
	
	public Bonificacion() {
		super(); 
		in = new Scanner(System.in);
		Servicio = 0;
		Bonificacion = 0.0;
		Total = 0.0;
		SueldoAnual = 0.0;
		Importe = 0.0;
	}
	
	public void PedirBonificacion(int miSueldo){
			System.out.println("ingrese el año de servicio :");
			Servicio = in.nextInt();
			
			if(miSueldo <5000 && Servicio >=10) {
				Bonificacion = 0.20;
			}else if(miSueldo <5000 && Servicio <10){
				Bonificacion = 0.05;
			}else if(miSueldo >=5000){
				Bonificacion = 0.0;
			}
			Total = miSueldo+(miSueldo * Bonificacion);
			SueldoAnual = Total/12;
			Importe +=Total;

	}
	//años de servicio
	public int getService(){
		return Servicio;
	}
	//Bonificacion
	public double getBonificacion(){
		return Bonificacion;
	}
	//salario total
	public double getTotal(){
		return Total;
	}
	//sueldo anual 
	public double getSueldoAnual(){
		return SueldoAnual;
	}
	
	
	
}
public class Bonificacion_Empleado {
	public static void main(String[] args) {
	}

}
