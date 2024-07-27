package com.MisEmpleados;


/*
 * En una empresa trabajan n empleados cuyos sueldos oscilan entre Q1000 y Q7500. 
	Realizar un programa que lea los sueldos que cobra cada empleado e informe cuántos empleados cobran entre 
	Q1000 y Q4000 y cuántos cobran más de Q4000. 
	Además, el programa deberá informar el importe que gasta la empresa en sueldos al personal.
 * 
 * 
 * */


import java.util.Scanner;


class Empleados extends Bonificacion{
	
	private int i,n,sueldos;
	private int cont1,cont2;
	public Scanner in;
	
	public Empleados() {
		in = new Scanner(System.in);
		sueldos = 0;
		n = 0;
		cont1=0;
		cont2=0;
		i=0;
	}
	
	public void SueldosE() {
		System.out.println("Ingrese una cantidad de empleados");
		n = in.nextInt();
		while(i<n) {
			System.out.println("Ingrese el primer suledo del empleado no. ["+(i+1)+"]");
			sueldos = in.nextInt();
			if(sueldos >=1000 && sueldos <=4000){
				cont1++;
				
			}else if(sueldos >4000) {
				cont2++;
			}
			PedirBonificacion(sueldos);
			DatosFinales(sueldos,i);
			i++;
		}	
		ResumenFinal();
		
	}
	public void  DatosFinales(int salario,int i){
		System.out.println("Empleado no. : ["+(i+1)+"]");
		System.out.println("Salario : "+salario);
		System.out.println("Años de Serviceio : "+getService());
		System.out.println("Bonificacion : "+getBonificacion());
		System.out.println("Totales : "+getTotal());
		System.out.println("sueldo Anual : "+getSueldoAnual());
		
	}
	public void ResumenFinal() {
		System.out.println("Cantidad de empleados que ganan entre 1000 y 4000 :"+cont1);
		System.out.println("Cantidad de empleados que ganan mas de 4000 :"+cont2);
		System.out.println(" ");
	}
	
}

public class Empleados_Sueldos {

	public static void main(String[] args) {
		Empleados misEmpleados = new Empleados();
		misEmpleados.SueldosE();
	}

}
